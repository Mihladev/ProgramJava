/*
Author: Mihlali Totwana
Student Number: 218283776
*/

public class MusicAlbumClass {
    private String artistNameOfAlbum1 = "Doja Cat";
    private String TitleOfAlbum1 = "Title: Hot Pink";
    private int numOfTracksinAlbum1 = 12;
    String[] Album1 = { "Cyber - Time: 2:46\n", "Won't bite - Time: 3:16\n", "Rules - Time: 3:08\n",
            "Bottom bitch - Time: 3:18\n", "Say so - Time: 3:58\n", "Talk Dirty - Time: 4:02\n",
            "Addiction - Time: 3:29\n", "Streets - Time: 3:47\n", "Shine - Time: 2:41\n", "Like that - Time: 2:44\n",
            "Better Than me - Time: 3:23\n", "Juicy - Time: 3:24\n" };

    private String artistNameOfAlbum2 = "Meghan Thee Stallion";
    private String TitleOfAlbum2 = "Title: Good News";
    private int numOfTracksinAlbum2 = 17;
    String[] Album2 = { "Shots Fired - Time: 2:51\n", "Circles - Time: 2:51\n", "Cry Baby - Time: 2:18\n",
            "Do it On The Trip - Time: 2:48\n", "Sugar Baby - Time: 2:27\n", "Movie - Time: 3:48\n",
            "Freaky Girls - Time: 2:47\n", "Body - Time: 2:52\n", "What's New - Time: 2:36\n",
            "Work That - Time: 2:15\n", "Intercourse - Time: 3:18\n", "Go Crazy - Time: 3:46\n",
            "Don't Rock Me To Sleep - Time: 3:04\n", "Outside - Time: 2:32\n", "Savage - Time: 4:03\n",
            "Girls in the Hood - Time: 2:35\n", "Don't Stop - Time: 3:08\n" };

    private String artistNameOfAlbum3 = "Ski Mask The Slump god";
    private String TitleOfAlbum3 = "Title: Archive";
    private int numOfTracksinAlbum3 = 4;
    String[] Album3 = { "Not Tonite - Time: 2:05\n", "Chemicals - Time: 3:29\n", "Giggle - Time: 3:21\n",
            "Spits - Time: 2:56\n" };

    private String artistNameOfAlbum4 = "Hillsong";
    private String TitleOfAlbum4 = "Title: There is More";
    private int numOfTracksinAlbum4 = 13;
    String[] Album4 = { "Who You Say I Am - Time: 5:30\n", "You Are Life - Time: 3:24\n", "The Passion - Time: 4:33\n",
            "God So Loved - Time: 4:32\n", "Be Still - Time: 8:08\n", "Remembrance - Time: 5:36\n",
            "Valentine - Time: 5:20\n", "Touch Of Heaven - Time: 7:08\n", "Lettered Love - Time: 3:43\n",
            "The Lord's Prayer - Time: 6:09\n", "New Wine - Time: 8:10\n", "So Will I - Time: 7:05\n",
            "Seasons - Time: 4:40\n" };

    private String artistNameOFAlbum5 = "Logic";
    private String TitleOfAlbum5 = "Title: No Pressure";
    private int numOfTracksinAlbum5 = 15;
    String[] Album5 = { "No pressure - Time: 2:55\n", "Hit My Line - Time: 4:26\n", "GP4 - Time: 4:35\n",
            "Celebration - Time: 3:51\n", "Open Mic - Time: 5:04\n", "Soul Food - Time: 5:34\n",
            "Perfect - Time: 1:41\n", "Man I is - Time: 4:30\n", "DadBod - Time: 4:55\n", "5 Hooks - Time: 3:53\n",
            "Dark Place - Time: 3:16\n", "A2Z - Time: 3:09\n", "Heard Em Say - Time: 3:36\n", "Amen - Time: 2:27\n",
            "Obediently Yours - Time: 6:10\n" };

    public String getTrackFromAlbum1(int a) {
        return Album1[a];
    }

    public String getTrackFromAlbum2(int a) {
        return Album2[a];
    }

    public String getTrackFromAlbum3(int a) {
        return Album3[a];
    }

    public String getTrackFromAlbum4(int a) {
        return Album4[a];
    }

    public String getTrackFromAlbum5(int a) {
        return Album5[a];
    }

    public void getAlbum1Details() {
        System.out.println("Artist name: " + artistNameOfAlbum1);
        System.out.println(TitleOfAlbum1);
        System.out.println("Number of Tracks: " + numOfTracksinAlbum1);
    }

    public void getAlbum2Details() {
        System.out.println("Artist name: " + artistNameOfAlbum2);
        System.out.println(TitleOfAlbum2);
        System.out.println("Number of Tracks: " + numOfTracksinAlbum2);
    }

    public void getAlbum3Details() {
        System.out.println("Artist name: " + artistNameOfAlbum3);
        System.out.println(TitleOfAlbum3);
        System.out.println("Number of Tracks: " + numOfTracksinAlbum3);
    }

    public void getAlbum4Details() {
        System.out.println("Artist name: " + artistNameOfAlbum4);
        System.out.println(TitleOfAlbum4);
        System.out.println("Number of Tracks: " + numOfTracksinAlbum4);
    }

    public void getAlbum5Details() {
        System.out.println("Artist name: " + artistNameOFAlbum5);
        System.out.println(TitleOfAlbum5);
        System.out.println("Number of Tracks: " + numOfTracksinAlbum5);
    }

    public void getListAlbum1() {
        for (int i = 0; i < Album1.length; i++) {
            System.out.println(Album1[i]);
        }
    }

    public void getListAlbum2() {
        for (int i = 0; i < Album2.length; i++) {
            System.out.println(Album2[i]);
        }
    }

    public void getListAlbum3() {
        for (int i = 0; i < Album3.length; i++) {
            System.out.println(Album3[i]);
        }
    }

    public void getListAlbum4() {
        for (int i = 0; i < Album4.length; i++) {
            System.out.println(Album4[i]);
        }
    }

    public void getListAlbum5() {
        for (int i = 0; i < Album5.length; i++) {
            System.out.println(Album5[i]);
        }
    }
}
