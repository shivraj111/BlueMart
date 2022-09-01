public class Test {



    public void getTestDataPath()
    {
        String path= null;
        path="src/test/resources/testData/"+System.getProperty("");

    }


    public static void main(String[] args) {

        String str_raw="GST Number :  27ABDFR1854R1ZJ";
        String gst_array[] = str_raw.split("GST Number :");
        System.out.println(gst_array[1].trim());

        System.out.println(str_raw.replaceAll("GST Number :","").trim());
    }
}
