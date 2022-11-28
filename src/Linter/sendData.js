
const fs = require("fs");

  linter.onclick = function () {
    var codeInput = document.getElementById("codeInput");
    var code = codeInput.value.trim();

    fs.writeFile("/test.txt", code, (err) => {
      if (err) {
        console.error(err);
      }
      // file written successfully
    });
  }

