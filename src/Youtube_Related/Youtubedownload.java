package Youtube_Related;

public class Youtubedownload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
          //  String url ;//= args[0];
            // ex: "/Users/axet/Downloads"
          //  String path = args[1];
            VGet v = new VGet(new URL("https://www.youtube.com/watch?v=Ck3tpTNPIyU"), new File("C:\\Users\\NIHAR RAMANANDI\\Downloads"));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}