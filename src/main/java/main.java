import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class main {
    private static String partnerCode ="0912345331";
    private static String categoryID ="114";
    private static String productID = "91";
    private static String productAmount = "100000";
    private static String customerID ="";
    private static String partnerTransID ="20220609092026971";
    private static String partnerTransDate ="20220609092026";
    private static String data ="1";

    private static final String publicKey = "MIGeMA0GCSqGSIb3DQEBAQUAA4GMADCBiAKBgIrlvOvqOTJgVmgVuv5GVSi30buj\n" +
        "cBuCAdV1SM51G0wlBq5Bj1VNYmu+kmV0tvxW8OHhQPcivAHauGUJ+GTucPAAf2Qw\n" +
        "bmGSqJ4Q59b7rh9DtzRDsbAd9It9XBBM91XndWDXAgsovgUaQBAJ85rRqTgNLVUS\n" +
        "90Lu18G1a9m5bR79AgMBAAE=";

    private static final String privateKey = "MIICXwKBAQACgYCz1KYAjrTIEMcxwPxBYtff8eN0rOd8MbwxFTMtlgQKGJTpq4FE\n" +
        "OADieykfqA/DdWx20wnwUrzHQDO32F9fqk1628WK9nAQcqDOj4A+/+t5Jo66Sqtw\n" +
        "4kd2UE/NmXGN516uSeENA+pQzDRyO9JWAUc/4fC9/IQL5Kz4780/BbFfZwKBAwEA\n" +
        "AQKBgBFFls4N5soiZmdecDv9eNtu+ZgutSsGAdu6/AfgVTH9C2xoBwnc0STvjFMY\n" +
        "iq8Mu6ar/VPiNnRys6TwOLTRABDn0PnFuQfIZKg/cDEeU85WPA7vkjx+xethT9t/\n" +
        "PHMRFCbzXHF6jqd5gHDY/icZqjuTAePJzRgC26z5FMyxmm6JAoFA7pz2ZP2DMRhC\n" +
        "DtlZwfyQW5WhCitMes5Iw/k9mz5x7KgRKQANuUOph9uSp8bEpu/2bfEu5AKp5jqL\n" +
        "0p55s4cTWQKBQMDvK6Fgwhw9taMFWakFg/LqaOEfFFv8x/wXPxNKGJpBKAmpD8Na\n" +
        "/Blh3h3q/KtSlGtWQZxdHMZa2CC1vqercL8CgUAYv0S6sqRBmj93pMkvWk9qgDlE\n" +
        "gbsb3XskgBwIltBf+ApXkz7ZIRBbG8W5Ct9oZOjM/D+dvDz8uMO5o2AB45d5AoFA\n" +
        "H2fPRlmlv0scQgkg6y6GqAgYQmz4t3CSbSqrjcxF7PYmOkxW0IoC927C5UPXFVw/\n" +
        "5KkJzRYrFO68t7Zd7pUtqQKBQN6AkvyrvhqPvIPWndQ289y516hvc0B5Sel1qzz6\n" +
        "gdzUxXbJxMzzxhGOJdTBaMMq9PiAoSMIRoL34QXI+XDEnKM=";

//    public static String dataSin = (partnerCode+"|" + categoryID + "|" + productID + "|"
//        +productAmount+"|"+customerID + "|"+partnerTransID+"|" + partnerTransDate +"|" +data );

    public static String dataSign = "(0912345331|114|91|100000||20220609092026971|20220609092026|1)";
    public static String sign = "iAkeSc8otdg6E3DFK5kQV27RJCavhjfRfc80j3Ksgwb2sdtJdm3z6yv9zukmI1o6wfO6oYeVcPVFRpJhB1dF9L2P08FH+BagfWRGVh23WOOwi5npLpBzIuizKFnyB+WKnZ9Vzk7Um3f+4aerBuclcjmmFVACjzLk6NrBOsWt9Do=";

    public static void main(String[] args) throws Exception {

        System.out.println(Cryto.createSign(dataSign,pathPub));
    }


}
