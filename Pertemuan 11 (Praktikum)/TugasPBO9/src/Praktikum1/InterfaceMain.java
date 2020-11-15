package Praktikum1;

import Praktikum1.*;

public class InterfaceMain {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Sarjana SarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
