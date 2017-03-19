/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MFCC;

/**
 *
 * @author HP
 */
public class MFCC {
    int sampleRate, panjangSinyalAudio;
    double lebarFrame;
    double panjangFrame;
    int JUMLAH_FRAME_SETELAH_DIBAGI;
    
    public void frameBlocking(){
        sampleRate = 44100;
        lebarFrame = 0.01; // 1 detik = 1000 ms, maka 0.01 detik = 10 ms
        panjangFrame = lebarFrame * sampleRate;         
        
        panjangSinyalAudio = 84058;
        JUMLAH_FRAME_SETELAH_DIBAGI = 0; // panjangSinyalAudio/panjangFrame        
    }
    
    
}
