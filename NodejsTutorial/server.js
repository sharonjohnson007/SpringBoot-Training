const express = require("express");
const mongoose = require("mongoose");
const morgan = require("morgan");
const bodyParser = require("body-parser");
const EmployeeRoute = require("./routes/employee");
const AuthRoute = require("./routes/auth");
mongoose.set("strictQuery", false);
mongoose.connect("mongodb://0.0.0.0:27017/firstdb", {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});
const db = mongoose.connection;

db.on("error", (err) => {
  console.log(err);
});

db.once("open", () => {
  console.log("Database Connection Established!");
});
const app = express();
app.use(morgan("dev"));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use("/uploads", express.static("uploads"));

const PORT = process.env.PORT || 8080;

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
app.use("/api/employee", EmployeeRoute);
app.use("/api", AuthRoute);
