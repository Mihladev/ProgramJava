/*
Author: Mihlali Totwana
Student Number: 218283776
*/

import java.util.Scanner;

public class MusicAlbumApp {
    public static void main(String[] args) {
        MusicAlbumClass user = new MusicAlbumClass();
        Scanner var = new Scanner(System.in);

        int a, b, c, d, e;

        System.out.println("Album details for Album 1:");
        user.getAlbum1Details();
        System.out.println("List of Tracks for Album 1: ");
        user.getListAlbum1();
        System.out.println("Enter track number to choose a song: ");
        a = var.nextInt();
        System.out.println(user.getTrackFromAlbum1(a));
        System.out.println("\n");

        System.out.println("Album details for Album 2:");
        user.getAlbum2Details();
        System.out.println("List of Tracks for Album 2: ");
        user.getListAlbum2();
        System.out.println("Enter track number to choose a song: ");
        b = var.nextInt();
        System.out.println(user.getTrackFromAlbum2(b));
        System.out.println("\n");

        System.out.println("Album details for Album 3:");
        user.getAlbum3Details();
        System.out.println("List of Tracks for Album 3: ");
        user.getListAlbum3();
        System.out.println("Enter track number to choose a song: ");
        c = var.nextInt();
        System.out.println(user.getTrackFromAlbum3(c));
        System.out.println("\n");

        System.out.println("Album details for Album 4:");
        user.getAlbum4Details();
        System.out.println("List of Tracks for Album 4: ");
        user.getListAlbum4();
        System.out.println("Enter track number to choose a song: ");
        d = var.nextInt();
        System.out.println(user.getTrackFromAlbum4(d));
        System.out.println("\n");

        System.out.println("Album details for Album 5:");
        user.getAlbum5Details();
        System.out.println("List of Tracks for Album 5: ");
        user.getListAlbum5();
        System.out.println("Enter track number to choose a song: ");
        e = var.nextInt();
        System.out.println(user.getTrackFromAlbum5(e));

    }
}
