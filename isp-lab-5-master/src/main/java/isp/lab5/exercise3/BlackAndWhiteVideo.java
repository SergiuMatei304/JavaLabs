/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab5.exercise3;

/**
 *
 * @author Sergiu
 */
public class BlackAndWhiteVideo implements Playable {

    private String fileName;

    public BlackAndWhiteVideo(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("Play black and white video " + fileName);
    }

}
