package Chapter10.Alone_p326;

import java.io.IOException;

public class FootballClubTest {
    public static void main(String[] args) throws IOException {
        FootballClub clubs = null;

        System.out.println("Club information:");
        System.out.println("Press C for Chelsea");
        System.out.println("Press L for Liverpool");
        System.out.println("Press M for ManchesterCity");
        
        int ch = System.in.read();
        if(ch == 'C' || ch == 'c') {
            clubs = new Chelsea();
        }
        else if(ch == 'L' || ch == 'l') {
            clubs = new Liverpool();
        }
        else if(ch == 'M' || ch == 'm') {
            clubs = new ManchesterCity();
        }
        else {
            System.out.println("Nothing correspond");
            return;
        }
        clubs.bestPlayer();
        clubs.manager();
    }
}
