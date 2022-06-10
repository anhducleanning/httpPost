import PAY_CARD.PAY_CARD;
import net.sf.json.JSONObject;
import org.json.JSONException;

import java.io.IOException;


public class Test {
    public static final String GET_URL = "http://117.103.207.81:8080/share/GetInfo";

    public static void main(String[] args) throws IOException, JSONException {

        String dataString = JSONObject.fromObject(
            PAY_CARD.DataObjectBuilder.aDataObject()
                .withPartnerCode("0912345331")
                .withCategoryID("114")
                .withProductID("91")
                .withProductAmount("100000")
                .withCustomerID("")
                .withPartnerTransID("20220609092026971")
                .withPartnerTransDate("20220609092026")
                .withData("1")
                .withDataSign("iAkeSc8otdg6E3DFK5kQV27RJCavhjfRfc80j3Ksgwb2sdtJdm3z6yv9zukmI1o6wfO6oYeVcPVFRpJhB1dF9L2P08FH+BagfWRGVh23WOOwi5npLpBzIuizKFnyB+WKnZ9Vzk7Um3f+4aerBuclcjmmFVACjzLk6NrBOsWt9Do=")
                .build()).toString();


        System.out.println(dataString);


//        URL obj = new URL(GET_URL);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//        // optional default is GET
//        con.setRequestMethod("GET");
//
//        //add request header
//        con.setRequestProperty("User-Agent", "Mozilla/5.0");
//        int responseCode = con.getResponseCode();
//        System.out.println("\nSending 'GET' request to URL : " + GET_URL);
//        System.out.println("Response Code : " + responseCode);
//
//
//        BufferedReader in = new BufferedReader(
//            new InputStreamReader(con.getInputStream()));
//        String inputLine;
//        StringBuffer response = new StringBuffer();
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//
//        System.out.println(response.toString());
//        //Read JSON response and print
//        JSONObject myResponse = new JSONObject(response.toString());
//        System.out.println("result after Reading JSON Response");
//        System.out.println("statusCode- "+myResponse.getString("statusCode"));
//        System.out.println("statusMessage- "+myResponse.getString("statusMessage"));
//        System.out.println("ipAddress- "+myResponse.getString("ipAddress"));
//        System.out.println("countryCode- "+myResponse.getString("countryCode"));
//        System.out.println("countryName- "+myResponse.getString("countryName"));
//        System.out.println("regionName- "+myResponse.getString("regionName"));
//        System.out.println("cityName- "+myResponse.getString("cityName"));
//        System.out.println("zipCode- "+myResponse.getString("zipCode"));
//        System.out.println("latitude- "+myResponse.getString("latitude"));
//        System.out.println("longitude- "+myResponse.getString("longitude"));
//        System.out.println("timeZone- "+myResponse.getString("timeZone"));
    }
}
