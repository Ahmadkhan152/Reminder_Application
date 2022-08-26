package com.example.remainder

const val TABLE_NAME="REMAINDER"
const val createTableQuery="CREATE TABLE $TABLE_NAME(ID INTEGER PRIMARY KEY autoincrement ,DATE VARCHAR(10),TIME VARCHAR(10),EVENT VARCHAR(50),UNIQUE(DATE,TIME))"
const val DROP_TABLE_QUERY = "DROP TABLE if exists $TABLE_NAME"
const val READ_TABLE_QUERY="Select* From $TABLE_NAME"
const val ERROR="Error!... "
const val _ID="ID"
const val DATE="DATE"
const val TIME="TIME"
const val EVENT="EVENT"
const val DATABASE_NAME="MyDataBase.db"
const val DELETE_QUERY="Delete From $TABLE_NAME Where $_ID = "
const val DELETE_RECORD="Record Deleted"
const val EMPTY_FIELDS="Empty Fields Are Not Allowed"
const val NO_RECORD="No Record Found"
const val ERRORINRECORD="Error! Entry Is Already Exist"
const val SUCCESSFULL="Successfull"
const val CHANNEL_ID="reminderAlarm"
const val NOTIFICATION_TITLE="Reminder Notification"
const val CONTENT_TEXT="We have get a new notification..."
const val CHANNEL_DESCRIPTION="Channel For Alarm Manager"
const val CHANNEL_NAME="Reminder Application Channel"