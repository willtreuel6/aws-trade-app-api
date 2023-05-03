package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name="gallery")
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "galleryId")
    private Integer galleryId;

    @Column(name = "galleryTitle")
    private String galleryTitle;

    @Column(name = "galleryDescription")
    private String galleryDescription;

    @Column(name = "galleryPath")
    private String galleryPath;

    Gallery(){}

    Gallery(Integer galleryId,String galleryTitle, String galleryDescription, String galleryPath){
        this.galleryId = galleryId;
        this.galleryTitle = galleryTitle;
        this.galleryDescription = galleryDescription;
        this.galleryPath = galleryPath;
    }

    public Integer getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Integer galleryId) {
        this.galleryId = galleryId;
    }

    public String getGalleryTitle() {
        return galleryTitle;
    }

    public void setGalleryTitle(String galleryTitle) {
        this.galleryTitle = galleryTitle;
    }

    public String getGalleryDescription() {
        return galleryDescription;
    }

    public void setGalleryDescription(String galleryDescription) {
        this.galleryDescription = galleryDescription;
    }

    public String getGalleryPath() {
        return galleryPath;
    }

    public void setGalleryPath(String galleryPath) {
        this.galleryPath = galleryPath;
    }
}
