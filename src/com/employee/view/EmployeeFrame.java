package com.employee.view;

import com.employee.controller.EmployeeHandler;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EmployeeFrame extends Frame {

    private Label employeeIdLbl;
    private TextField employeeIdTxt;
    private Label employeeNameLbl;
    private TextField employeeNameTxt;
    private Checkbox maleOption;
    private Checkbox femaleOption;
    private Checkbox otherOption;
    private Label employeeGenderLbl;
    private Label employeePerkLbl;
    private Checkbox pfOption;
    private Checkbox gradutiyOption;
    private Checkbox mealCardOption;
    private Checkbox npsOption;
    private Checkbox mediclaimOption;
    private CheckboxGroup genderGroup;
    private Choice officeLocation;
    private Label locationLbl;
    private Label employeeSalaryLbl;
    private TextField employeeSalaryTxt;
    private Label employeeAddressLbl;
    private TextArea employeeAddressTxt;
    private Button saveButton ;
    private Button searchButton;
    private Button updateButton;
    private Button deleteButton;
    private Button firstButton;
    private Button nextButton ;
    private Button prevButton;
    private Button lastButton;

    public EmployeeFrame() {
        setBounds(50, 50, 700, 550);
        setTitle("Employee Information");
        setVisible(true);
        setLayout(null);

        genderGroup = new CheckboxGroup();

        employeeIdLbl = new Label("Employee Id");
        employeeIdLbl.setBounds(20,50,100,20);
        add(employeeIdLbl);

        employeeIdTxt = new TextField();
        employeeIdTxt.setBounds(140,50,100,20);
        add(employeeIdTxt);

        employeeNameLbl = new Label("Employee Name");
        employeeNameLbl.setBounds(20,90,100,20);
        add(employeeNameLbl);

        employeeNameTxt = new TextField();
        employeeNameTxt.setBounds(140,90,100,20);
        add(employeeNameTxt);

        employeeGenderLbl = new Label("Employee Gender");
        employeeGenderLbl.setBounds(20,130,110,20);
        add(employeeGenderLbl);

        maleOption = new Checkbox("Male",true,genderGroup);
        maleOption.setBounds(140,130,60,20);
        add(maleOption);

        femaleOption = new Checkbox("Female",false,genderGroup);
        femaleOption.setBounds(210,130,60,20);
        add(femaleOption);

        otherOption = new Checkbox("Other",false,genderGroup);
        otherOption.setBounds(290,130,60,20);
        add(otherOption);

        employeePerkLbl = new Label("Employee Perks");
        employeePerkLbl.setBounds(20,170,100,20);
        add(employeePerkLbl);

        pfOption = new Checkbox("PF");
        pfOption.setBounds(140,170,60,20);
        add(pfOption);

        gradutiyOption = new Checkbox("Graduity");
        gradutiyOption.setBounds(220,170,80,20);
        add(gradutiyOption);

        mealCardOption = new Checkbox("Meal Card");
        mealCardOption.setBounds(320,170,90,20);
        add(mealCardOption);

        npsOption = new Checkbox("NPS");
        npsOption.setBounds(430,170,60,20);
        add(npsOption);

        mediclaimOption = new Checkbox("Mediclaim");
        mediclaimOption.setBounds(500,170,100,20);
        add(mediclaimOption);

        locationLbl = new Label("Location");
        locationLbl.setBounds(20,210,100,20);
        add(locationLbl);

        officeLocation = new Choice();
        officeLocation.setBounds(140,210,100,20);

        officeLocation.add("Pune");
        officeLocation.add("Hyderabad");
        officeLocation.add("Bangalore");
        officeLocation.add("Hubali");
        officeLocation.add("Chennai");

        add(officeLocation);

        employeeAddressLbl = new Label("Employee Address");
        employeeAddressLbl.setBounds(290,210,100,20);
        add(employeeAddressLbl);

        employeeAddressTxt = new TextArea();
        employeeAddressTxt.setBounds(430,210,180,120);
        add(employeeAddressTxt);

        employeeSalaryLbl = new Label("Employee Salary");
        employeeSalaryLbl.setBounds(20,250,111,140);
        add(employeeSalaryLbl);

        employeeSalaryTxt = new TextField();
        employeeSalaryTxt.setBounds(140,310,120,20);
        add(employeeSalaryTxt);

        saveButton = new Button("Save");
        saveButton.setBounds(140,400,70,30);
        add(saveButton);
        saveButton.addActionListener(new EmployeeHandler(this));

        searchButton = new Button("Search");
        searchButton.setBounds(220, 400, 70, 30);
        add(searchButton);
        searchButton.addActionListener(new EmployeeHandler(this));

        updateButton = new Button("Update");
        updateButton.setBounds(300, 400, 70, 30);
        add(updateButton);
        updateButton.addActionListener(new EmployeeHandler(this));
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                EmployeeFrame ef = (EmployeeFrame)e.getSource();
                ef.dispose();
            }
        });

        deleteButton = new Button("Delete");
        deleteButton.setBounds(380, 400, 70, 30);
        add(deleteButton);
        deleteButton.addActionListener(new EmployeeHandler(this));

        firstButton = new Button("First");
        firstButton.setBounds(140, 450, 70, 30);
        add(firstButton);
        firstButton.addActionListener(new EmployeeHandler(this));

        nextButton = new Button("Next");
        nextButton.setBounds(220, 450, 70, 30);
        add(nextButton);
        nextButton.addActionListener(new EmployeeHandler(this));

        prevButton = new Button("Prev");
        prevButton.setBounds(300, 450, 70, 30);
        add(prevButton);
        prevButton.addActionListener(new EmployeeHandler(this));

        lastButton = new Button("Last");
        lastButton.setBounds(380, 450, 70, 30);
        add(lastButton);
        lastButton.addActionListener(new EmployeeHandler(this));
    }

    public Label getEmployeeIdLbl() {
        return employeeIdLbl;
    }

    public void setEmployeeIdLbl(Label employeeIdLbl) {
        this.employeeIdLbl = employeeIdLbl;
    }

    public TextField getEmployeeIdTxt() {
        return employeeIdTxt;
    }

    public void setEmployeeIdTxt(TextField employeeIdTxt) {
        this.employeeIdTxt = employeeIdTxt;
    }

    public Label getEmployeeNameLbl() {
        return employeeNameLbl;
    }

    public void setEmployeeNameLbl(Label employeeNameLbl) {
        this.employeeNameLbl = employeeNameLbl;
    }

    public TextField getEmployeeNameTxt() {
        return employeeNameTxt;
    }

    public void setEmployeeNameTxt(TextField employeeNameTxt) {
        this.employeeNameTxt = employeeNameTxt;
    }

    public Checkbox getMaleOption() {
        return maleOption;
    }

    public void setMaleOption(Checkbox maleOption) {
        this.maleOption = maleOption;
    }

    public Checkbox getFemaleOption() {
        return femaleOption;
    }

    public void setFemaleOption(Checkbox femaleOption) {
        this.femaleOption = femaleOption;
    }

    public Checkbox getOtherOption() {
        return otherOption;
    }

    public void setOtherOption(Checkbox otherOption) {
        this.otherOption = otherOption;
    }

    public Label getEmployeeGenderLbl() {
        return employeeGenderLbl;
    }

    public void setEmployeeGenderLbl(Label employeeGenderLbl) {
        this.employeeGenderLbl = employeeGenderLbl;
    }

    public Label getEmployeePerkLbl() {
        return employeePerkLbl;
    }

    public void setEmployeePerkLbl(Label employeePerkLbl) {
        this.employeePerkLbl = employeePerkLbl;
    }

    public Checkbox getPfOption() {
        return pfOption;
    }

    public void setPfOption(Checkbox pfOption) {
        this.pfOption = pfOption;
    }

    public Checkbox getGradutiyOption() {
        return gradutiyOption;
    }

    public void setGradutiyOption(Checkbox gradutiyOption) {
        this.gradutiyOption = gradutiyOption;
    }

    public Checkbox getMealCardOption() {
        return mealCardOption;
    }

    public void setMealCardOption(Checkbox mealCardOption) {
        this.mealCardOption = mealCardOption;
    }

    public Checkbox getNpsOption() {
        return npsOption;
    }

    public void setNpsOption(Checkbox npsOption) {
        this.npsOption = npsOption;
    }

    public Checkbox getMediclaimOption() {
        return mediclaimOption;
    }

    public void setMediclaimOption(Checkbox mediclaimOption) {
        this.mediclaimOption = mediclaimOption;
    }

    public CheckboxGroup getGenderGroup() {
        return genderGroup;
    }

    public void setGenderGroup(CheckboxGroup genderGroup) {
        this.genderGroup = genderGroup;
    }

    public Choice getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(Choice officeLocation) {
        this.officeLocation = officeLocation;
    }

    public Label getLocationLbl() {
        return locationLbl;
    }

    public void setLocationLbl(Label locationLbl) {
        this.locationLbl = locationLbl;
    }

    public Label getEmployeeSalaryLbl() {
        return employeeSalaryLbl;
    }

    public void setEmployeeSalaryLbl(Label employeeSalaryLbl) {
        this.employeeSalaryLbl = employeeSalaryLbl;
    }

    public TextField getEmployeeSalaryTxt() {
        return employeeSalaryTxt;
    }

    public void setEmployeeSalaryTxt(TextField employeeSalaryTxt) {
        this.employeeSalaryTxt = employeeSalaryTxt;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(Button searchButton) {
        this.searchButton = searchButton;
    }

    public Button getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(Button updateButton) {
        this.updateButton = updateButton;
    }
}
