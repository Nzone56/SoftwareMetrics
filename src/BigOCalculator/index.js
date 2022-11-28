// when button is clicked, gets the text from the text area:

var getBigOBtn = document.getElementById("getBigOBtn");
getBigOBtn.onclick = function () {
  var codeInput = document.getElementById("codeInput");
  var code = codeInput.value.trim();

  // now parse the text
  var result = parseInput(code);

  // set the result
  const astShow = document.getElementById("astShow");
  const ccShow = document.getElementById("ccShow");
  const linterShow = document.getElementById("linterShow");
  ccShow.innerHTML = " ";
  linterShow.innerHTML = " ";
  astShow.innerHTML = " "; 
  var resultShow = document.getElementById("resultShow");
  resultShow.innerHTML = result;
  if (result == "The Big O Notation is: O(1)") {
    var imageshown = "/src/assets/img/Phase_1.png";
  } else {
    if (result == "The Big O Notation is: O(log(N))") {
      var imageshown = "/src/assets/img/Phase_2.png";
    } else {
      if (result == "The Big O Notation is: O(N)") {
        var imageshown = "/src/assets/img/Phase_3.png";
      } else {
        if (result == "The Big O Notation is: O(N^2)") {
          var imageshown = "/src/assets/img/Phase_4.png";
        } else {
        if (result == "The Big O Notation is: O(N^3)") {
          var imageshown = "/src/assets/img/Phase_5.png";
        }
      }
      }
    }
  }
  document.getElementById("img").src = imageshown;
};

// this function should parse the input of the code and determine the big O notation
// params:
//  code: The code input
function parseInput(code) {
  // get the for statement
  let newlineSplit = code.split("\n");
  let forStatements = getForStatements(newlineSplit);
  let result = getBigONotation(forStatements);
  return "The Big O Notation is: " + result ;
}
