import { getData } from "./getData";



  var linter = document.getElementById("linter");
  linter.onclick = function () {
  var codeInput = document.getElementById("codeInput");
  var code = codeInput.value.trim();  

  // now parse the text
  var result = getData(code);

  // set the result
  const astShow = document.getElementById("astShow");
  const ccShow = document.getElementById("ccShow");
  const resultShow = document.getElementById("resultShow");
  ccShow.innerHTML = " ";
  resultShow.innerHTML = " ";
  astShow.innerHTML = " ";
  var linterShow = document.getElementById("linterShow");
  linterShow.innerHTML = result;

  };





// this function should parse the input of the code and determine the big O notation
// params:
//  code: The code input

