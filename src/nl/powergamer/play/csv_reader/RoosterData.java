package nl.powergamer.play.csv_reader;

/**
 * Created by Tristan on 4/10/2018.
 */
public class RoosterData {
    private String date;
    private String starttime;
    private String endtime;
    private String subject;
    private String teacher_email;
    private String location;
    private String group_code;

    public RoosterData(String parse) throws Exception {
        String[] input_strings = parse.split(","); //Comma delimited file (CSV)
        if(input_strings.length == 7) {
            date = input_strings[0];
            starttime = input_strings[1];
            endtime = input_strings[2];
            subject = input_strings[3];
            teacher_email = input_strings[4];
            location = input_strings[5];
            group_code = input_strings[6];
        }
        else
        {
            throw new Exception("Parse exception");
        }

    }
    public RoosterData(String date, String starttime, String endtime, String subject, String teacher_email, String location, String group_code) {
        this.date = date;
        this.starttime = starttime;
        this.endtime = endtime;
        this.subject = subject;
        this.teacher_email = teacher_email;
        this.location = location;
        this.group_code = group_code;
    }
}
