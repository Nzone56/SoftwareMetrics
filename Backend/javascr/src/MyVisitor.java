
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyVisitor<T> extends JavaScriptBaseVisitor{

    Map<String, String> inicVars = new HashMap<String, String>();

    Set<String> declVars = new HashSet<String>();

    @Override
    public T visitProgram(JavaScriptParser.ProgramContext ctx) {


        return (T) this.visitChildren(ctx);
    }



    
    
    @Override
    public T visitVariableDeclarators(JavaScriptParser.VariableDeclaratorsContext ctx){
        boolean num=false;
        String vname="";
        String equals="";

        int times=0;
        if(ctx.variableDeclaratorVar() !=null){
            times=ctx.variableDeclaratorVar().variableDeclarator().size();
        }
        else{
            times= ctx.variableDeclarator().size();
        }


        for(int i=0; i<times;i++) {
            if(ctx.variableDeclaratorVar() !=null){
                vname=ctx.variableDeclaratorVar().variableDeclarator(i).id().IDENTIFIER().toString();
                System.out.println("Variable '" + vname + "' se declaro usando 'var' , se recomienda usar 'let' ");

                if(ctx.variableDeclaratorVar().variableDeclarator(i).expression()==null){
                    declVars.add(vname);
                }
                else{

                    equals=ctx.variableDeclaratorVar().variableDeclarator(i).expression().getText();


                    if(inicVars.containsKey(equals)){
                        inicVars.put(vname, inicVars.get(equals));
                    }
                    else{
                        inicVars.put(vname,equals);
                    }

                }
            }
            else{
                vname = ctx.variableDeclarator(i).id().IDENTIFIER().toString();

                if(ctx.variableDeclarator(i).expression()==null){
                    declVars.add(vname);
                }
                else{
                    equals=ctx.variableDeclarator(i).expression().getText();




                    if(inicVars.containsKey(equals)){
                        inicVars.put(vname, inicVars.get(equals));
                    }
                    else{

                        if(equals.matches("[0-9]+")){
                            num=true;
                        }else{
                            try {
                                Double.parseDouble(equals);
                                num=true;
                            } catch(NumberFormatException nfe) {
                                if(equals.contains("\"") || equals.contains("'")){
                                    num=true;
                                }
                            }
                        }

                        if(num){
                            inicVars.put(vname,equals);
                        }
                        else{
                            if(equals.contains("+") || equals.contains("-")  || equals.contains("/") || equals.contains("%") || equals.contains("*")){
                                String aux=equals.replace(" ","");
                                Pattern pattern=Pattern.compile("[+-]?[0-9]+");
                                Matcher matcher=pattern.matcher(aux);
                                int res=0;
                                while(matcher.find()){
                                    res+=Integer.valueOf(matcher.group());
                                }
                                inicVars.put(vname,Integer.toString( res));
                            }else{
                            System.out.println("Se intenta inicializar la variable '"+ vname+"' con otra variable no inicializada o creada, se recomienda crearla o inicializarla primero");}
                        }

                    }

                }
            }








        }

        return null;
    }


    @Override
    public T visitVariableDeclarator(JavaScriptParser.VariableDeclaratorContext ctx){
        String id=  ctx.id().IDENTIFIER().getText() ;
        String equals=ctx.expression().getText();
        if(ctx.expression()==null) {
          visitChildren(ctx);
        }
        else{
            
            if(declVars.contains(id)){
                inicVars.put(id,equals);
                declVars.remove(id);
            } else if (inicVars.containsKey(id)) {
                inicVars.remove(id);
                inicVars.put(id,equals);
            }else{
                visitChildren(ctx);
            }
        }






        return null;
    }

    @Override
    public T visitId(JavaScriptParser.IdContext ctx) {
        String idToEvaluate=  ctx.IDENTIFIER().getText();
        String idvalue= inicVars.get( idToEvaluate );
        boolean iddeclare= declVars.contains( idToEvaluate);
        if( idvalue==null){
            if(iddeclare==true){
                System.out.println("La variable  '" + idToEvaluate + "' no fue inicializada, se recomienda inicializar primero");
            }
            else {
                System.out.println("La variable  '" + idToEvaluate + "' no existe, se recomienda crearla primero");
            }
        }

        return (T) visitChildren(ctx); }

    @Override
    public T visitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
        String idFunct= ctx.IDENTIFIER().toString();
        inicVars.put(idFunct,"%Funcion");

        return (T) visitChildren(ctx); }
    @Override
    public T visitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {

        String id=ctx.expression(0).getText();

        String equals= ctx.expression(1).getText();
        if(declVars.contains(id)){
            inicVars.put(id,equals);
            declVars.remove(id);
        } else if (inicVars.containsKey(id)) {
            inicVars.remove(id);
            inicVars.put(id,equals);
        }else{
            visitChildren(ctx);
        }


        return null; }
    @Override
    public T visitForControl(JavaScriptParser.ForControlContext ctx) {
        return (T) this.visitChildren(ctx);
    }
}
