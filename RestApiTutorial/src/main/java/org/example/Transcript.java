package org.example;

public class Transcript {
    private String audio_url;
    private String id;
    private String status;
    private String text;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(String transcript_id) {
        this.id = transcript_id;
    }

    public String getId() {
        return id;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getAudio_url() {
        return audio_url;
    }
}
