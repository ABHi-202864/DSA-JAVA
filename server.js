const express = require("express");
const app = express();


//Routing
app.get("/", (req, res) => {
    res.send("hello world");
});







app.listen(3000);