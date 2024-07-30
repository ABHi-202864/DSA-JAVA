const express = require("express");
const app = express();
const http = require("http");
const path = require("path");
const socketio = require("socket.io");
const server = http.createServer(app);
const io = socketio(server);

app.set("view engine", "ejs");
app.set(express.static(path.join(__dirname, "public")));

app.get("/", (req, res) => {
    res.send("i'm root");
});


// _________________
app.get("/show", (req, res, next) => {
    res.send("im root");
});

server.listen(3000, () => console.log("doking on - 3000"));