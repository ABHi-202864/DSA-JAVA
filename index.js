const express = require("express");
const app = express();



// home route
app.get("/", (req, res) => {
    res.send("hello world");
});






// Docking Port
app.listen(3000, () => {
    console.log("app listen...");
});