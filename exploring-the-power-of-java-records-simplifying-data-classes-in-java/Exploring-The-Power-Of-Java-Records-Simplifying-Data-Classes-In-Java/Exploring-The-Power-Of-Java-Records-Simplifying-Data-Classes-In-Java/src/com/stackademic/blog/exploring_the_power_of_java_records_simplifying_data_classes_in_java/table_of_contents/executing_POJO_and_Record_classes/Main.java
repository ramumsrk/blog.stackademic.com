package com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.executing_POJO_and_Record_classes;

import com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.writing_a_record_class.ClientRecord;
import com.stackademic.blog.exploring_the_power_of_java_records_simplifying_data_classes_in_java.table_of_contents.writing_a_traditional_POJO_class.Client;

import static java.lang.System.out;

public class Main {
  static public void main( String[] args ) {
      Client firstClient = new Client(
        101,
        "Mark",
        "Anderson",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      Client secondClient = new Client(
        102,
        "Dean",
        "Becker",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      out.printf("First client details: %s\n",firstClient.toString());
      out.printf("Second client details: %s\n",secondClient.toString());
      ClientRecord thirdClientRecord = new ClientRecord(
        101,
        "Mark",
        "Anderson",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      ClientRecord fourthClientRecord = new ClientRecord(
        102,
        "Dean",
        "Becker",
        "42 Java Street",
        "0001111",
        "mark.a@gmail.com"
      );
      out.printf("Third client details: %s\n",thirdClientRecord.toString());
      out.printf("Fourth client details: %s\n", fourthClientRecord.toString());
    return;
  }
}