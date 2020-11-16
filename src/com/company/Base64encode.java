package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64encode {

    public static void main(String[] args) {
        createHTMLAndConvertToBase64EncodedString();
    }

    public  static  void createHTMLAndConvertToBase64EncodedString() {
        String eventName = "MA filters - Exhibitors";
        String attendeeName = "Aqua Man";
        String appointmentDate = "Sunday, August 2, 2020";
        String appointmentTime = "1:00 AM - 11:00 PM ET";
        String appointmentType = "Unconfirmed Appointment";
        String host = "Aqua Man";
        String pendingAttendees = "Shubham Rajput";
        String pendingAttendeeCompany = "Airtel";
        String apptSubject = "Test Zone Appt";
        String locationName = "Starbucks";

        StringBuilder sb = new StringBuilder();
        sb.append("<html><body><div style='margin-top: 15px; width: 100%; height: 570px; text-align: left; " +
                "background-color: white; color: black'>")
                .append("<div style='margin: 13px 13px 0; padding: 12px; font-weight: 300; background-color: #365B6D;" +
                        "color: #FFFFFF;'>")
                .append("<h1 style='display: inline; max-height: 50px; vertical-align: top; font-weight: 300; " +
                        "font-size: 15px;'><img style='display: inline-block; margin-right: 20px; max-height: 50px;' " +
                        "src=https:silo456-custom.core.cvent.org/59ADC803C5E148419549B286163B3312/pix/8e59b15c95104e248eb4abf9ed4ba74a.jpg" +
                        " role=img>")
                .append(eventName).append("</h1>")
                .append("</div>").append("<div style='clear: both; margin-bottom: 60px;'>")
                .append("<div style='padding-top: 20px; margin-left: 13px; font-size:14px;'>")
                .append("<span sytle='padding-left: 20px;'>").append("<span style='font-weight:bold'>")
                .append(attendeeName).append("</span>").append("</span>")
                .append("<span></span>").append("</div>").append("<div>")
                .append("<h3 style='text-align: center; font-size: 17px; font-weight: 700; color: #444444;" +
                        " clear: both; width: 100%; margin-top: 23px; word-break: break-word;'>")
                .append(appointmentDate)
                .append("<ul style='margin: 0; padding: 0; list-style-type: none;'>")
                .append("<li style='display: list-item; text-align: -webkit-match-parent;'>")
                .append("<div style='border-bottom: 1px solid #444444; color: black; clear: both; margin-right: 13px;" +
                        " margin-left: 13px; padding: 24px 0 5px; font-weight: normal;'>")
                .append("<span style='width: 38%; word-break: break-word; text-align: left; vertical-align: top;" +
                        " font-weight: 400; font-size: 14px; margin-top: -2px; float: left;'>")
                .append(appointmentTime).append("</span>")
                .append("<span style='width: 24%; margin-left: 13px; margin-right: auto; display: inline-block; " +
                        "vertical-align: bottom; font-size: 13px; text-align: center;'>")
                .append("<span class='locIcon' role=img aria-hidden=true>&#xf3c5;")
                .append("<span style='word-break: break-word; margin-left: 5px'>").append(locationName).append(
                "</span>")
                .append("</span>")
                .append("</span>")
                .append("<span style='font-size: 13px; position: relative; margin-left: 10px; " +
                        " width: 32%; text-align: right; word-break: break-word; margin-top: -1px; vertical-align: top; " +
                        " float: right;'>").append(appointmentType).append("</span>")
                .append("</div>").append("<div style='margin-right: 12px; margin-left: 12px; padding: 5px 10px 6px;'>")
                .append("<div style='width: 40%; word-break: break-word; font-size: 13px; color: #3B4D54;" +
                        " float: left; font-weight: normal;'>")
                .append("<div style='float: left; padding-bottom: 8px;'>")
                .append("<div><span style='font-weight: bold;'>Host</span>: ").append(host)
                .append("</div>").append("</div>")
                .append("<div style='float: left; clear: left; padding-bottom: 8px;'>")
                .append("<div style='text-align: left';><span style='font-weight: bold;'>Pending Attendees</span>: ")
                .append(pendingAttendees)
                .append(" (").append(pendingAttendeeCompany).append(") ").append("</div>").append("</div>")
                .append("</div>").append("<div style='float: right; width: 35%; margin-left: 36px;" +
                " word-break: break-word; text-align: left; font-size: 13px; color: #3B4D54; font-weight: normal;'>")
                .append("<div style='padding-bottom: 8px;'>")
                .append("<span style='font-weight: bold;'>Subject</span>: ").append(apptSubject).append("</div>")
                .append("</div>").append("</div>").append("</li>").append("</ul>").append("</div>")
                .append("<div></div>").append("</div>").append("</div><body><html>");

        String base64EncodedString = Base64.getEncoder()
                .encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8));

        System.out.println(base64EncodedString);

    }
}
