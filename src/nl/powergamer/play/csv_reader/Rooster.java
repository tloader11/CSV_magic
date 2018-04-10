package nl.powergamer.play.csv_reader;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tristan on 4/10/2018.
 */
public class Rooster
{
    private ArrayList<RoosterData> rooster = new ArrayList<RoosterData>();

    public Rooster()
    {
        //import data later.
    }

    public void importData(String rawData) throws Exception {
        String[] data = rawData.split("\n");
        for(String s : data)
        {
            rooster.add(new RoosterData(s));
        }
    }

    public void addItem(String date, String starttime, String endtime, String subject, String teacher_email, String location, String group_code)
    {
        rooster.add(new RoosterData(date, starttime, endtime, subject, teacher_email, location, group_code));
    }

    public Rooster(String rawData) throws Exception
    {
        String[] data = rawData.split("\n");
        for(String s : data)
        {
            rooster.add(new RoosterData(s));
        }
    }

    public ArrayList<RoosterData> getData()
    {
        return this.rooster;
    }


}
