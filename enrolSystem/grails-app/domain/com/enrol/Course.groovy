package com.enrol

class Course {

String title

String department

String leader

String code

Date startDate

Date endDate

String studyMode

String description

int numberOfStudents

Double tuitionFees

    static constraints = {

title blank:false, nullable:false
department blank:false, nullable:false
leader blank:false, nullable:false
code blank:false, nullable:false
numberOfStudents blank:false, nullable:false, min:20, max:60
startDate blank:false, nullable:false
endDate blank:false, nullable:false
studyMode blank:false, nullable:false
description blank:false, nullable:false
tuitionFees blank:false, nullable:false, amountscale:2


    }
}
