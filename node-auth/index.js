const cors = require("cors");
const exp = require("express");
const bp = require("body-parser");
var mongoose = require("mongoose");
var passport = require("passport");
const { success, error } = require("consola");
//Bring the app constants
const { DB, PORT } = require("./config");
//const passport = require("./middlewares/passport");
//Initialize the application
const app = exp();
//Middlewares
app.use(cors());
app.use(bp.json());
app.use(passport.initialize());
//const passport = require("./middlewares/passport");
//User router middleware
app.use("/api/users", require("./routes/users"));
mongoose.set("strictQuery", false);
// var myDatabase= database.db("node-auth");
const startApp = async () => {
  try {
    //To connect with db
    mongoose.connect(DB, {
      // useFindAndModify: true,
      // useUnifiedTopology: true,
      // useNewUrlParser: true
    });
    success({
      message: `Successfully connected with the Database ${DB} `,
      badge: true,
    });
    app.listen(PORT, () =>
      success({
        message: `Server started on PORT ${PORT} `,
        badge: true,
      })
    );
  } catch (err) {
    error({
      message: `Unable to connect with the Database ${err} `,
      badge: true,
    });
    startApp();
  }
};
startApp();
