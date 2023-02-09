//To import models
const { response } = require("express");
const Employee = require("../models/EmployeeModels");

//To show the list of employees
const index = (req, res, next) => {
  Employee.find()
    .then((response) => {
      res.json({
        response,
      });
    })
    .catch((error) => {
      res.json({
        message: "An error Occured!",
      });
    });
};
//To find Employee ById
const show = (req, res, next) => {
  let employeeId = req.body.employeeId;
  Employee.findById(employeeId)
    .then((response) => {
      res.json({
        response,
      });
    })
    .catch(() => {
      res.json({
        message: "An error Occured!",
      });
    });
};
//To add an employee
const store = (req, res, next) => {
  let employee = new Employee({
    name: req.body.name,
    designation: req.body.designation,
    email: req.body.email,
    phone: req.body.phone,
    age: req.body.age,
  })
  if(req.file){
employee.avatar=req.file.path
  }
  employee
    .save()
    .then(() => {
      res.json({
        message: "Employee Added Sucessfully",
      });
    })
    .catch(() => {
      res.json({
        message: "An error Occured!",
      });
    });
};
//To update an employee
const update = (req, res, next) => {
  let employeeId = req.body.employeeId;
  let updatedData = {
    name: req.body.name,
    designation: req.body.designation,
    email: req.body.email,
    phone: req.body.phone,
    age: req.body.age,
  };
  Employee.findByIdAndUpdate(employeeId,  {$set: updatedData })
    .then(() => {
      res.json({
        message: "Employee Updated Sucessfully",
      });
    })
    .catch(() => {
      res.json({
        message: "An error Occured!",
      });
    });
};
//To delete employee ById
const destroy = (req, res, next) => {
  let employeeId = req.body.employeeId;
  Employee.findByIdAndRemove(employeeId)
    .then(() => {
      res.json({
        message: "Employee Deleted Sucessfully",
      });
    })
    .catch((error) => {
      res.json({
        message: "An error Occured!",
      });
    });
};
module.exports = {
  index,
  show,
  store,
  destroy,
  update,
};
