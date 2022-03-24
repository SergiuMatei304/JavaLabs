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
public class ProxyVideo implements Playable {

    private Playable video;
    private String fileName;

    public ProxyVideo(Playable video,String fileName){
        this.fileName = fileName;
        if(video instanceof BlackAndWhiteVideo || video instanceof ColorVideo) {
            this.video = video;
        }
        else{
            this.video = null;
        }
    }

    @Override
    public void play() {
        if(video == null){
            video = new BlackAndWhiteVideo(fileName);
        }
        video.play();
    }
}
