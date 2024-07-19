const express = require("express");
const app = express();

// Load .env variable
require('dotenv').config();

//Routing
app.get("/", (req, res) => {
    res.send("hello world");
});






// Docking Port
app.listen(process.env.PORT);