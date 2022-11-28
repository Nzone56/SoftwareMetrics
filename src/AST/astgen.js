const esprima = require("esprima"); 

var getAST = document.getElementById("getAST");
getAST.onclick = function () {
    var imageshown = "/src/assets/img/pixels.png";
    document.getElementById("img").src = imageshown;
    console.log("lol"); 
    var codeInput = document.getElementById("codeInput");
    var code = codeInput.value;
    
    // now parse the text
    // set the result
     const ast = esprima.parseModule(code);
    const astShow = document.getElementById("astShow");
    const resultShow = document.getElementById("resultShow");
    const ccShow = document.getElementById("ccShow");
    const linterShow = document.getElementById("linterShow");
    resultShow.innerHTML = " ";
    ccShow.innerHTML = " ";
    linterShow.innerHTML = " ";
    astShow.innerHTML = JSON.stringify(ast, null, " ");
};

     

    