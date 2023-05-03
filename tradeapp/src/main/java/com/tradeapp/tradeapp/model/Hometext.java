package com.tradeapp.tradeapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "hometext")
public class Hometext {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homeTextId")
    private Integer homeTextId;

    @Column(name = "homeTextBannerHeaderOne")
    private String homeTextBannerHeaderOne;

    @Column(name = "homeTextBannerHeaderTwo")
    private String homeTextBannerHeaderTwo;

    @Column(name = "homeTextBannerDescription")
    private String homeTextBannerDescription;

    @Column(name = "homeTextBannerFooter")
    private String homeTextBannerFooter;

    @Column(name = "homeTextCallTop")
    private String homeTextCallTop;
    //Call to action horizontal row

    @Column(name = "homeTextCallBottom")
    private String homeTextCallBottom;

    @Column(name = "homeTextContactHeader")
    private String homeTextContactHeader;

    @Column(name = "homeTextContactDescription")
    private String homeTextContactDescription;

    @Column(name = "homeTextFaqHeader")
    private String homeTextFaqHeader;

    @Column(name = "homeTextFaqDescription")
    private String homeTextFaqDescription;

    @Column(name = "homeTextFaqq1")
    private String homeTextFaqq1;

    @Column(name = "homeTextFaqa1")
    private String homeTextFaqa1;

    @Column(name = "homeTextFaqq2")
    private String homeTextFaqq2;

    @Column(name = "homeTextFaqa2")
    private String homeTextFaqa2;

    @Column(name = "homeTextFaqq3")
    private String homeTextFaqq3;

    @Column(name = "homeTextFaqa3")
    private String homeTextFaqa3;

    @Column(name = "homeTextFaqq4")
    private String homeTextFaqq4;

    @Column(name = "homeTextFaqa4")
    private String homeTextFaqa4;

    @Column(name = "homeTextPricingHeader")
    private String homeTextPricingHeader;

    @Column(name = "homeTextPriceOneHeader")
    private String homeTextPriceOneHeader;

    @Column(name = "homeTextPriceTwoHeader")
    private String homeTextPriceTwoHeader;

    @Column(name = "homeTextPriceThreeHeader")
    private String homeTextPriceThreeHeader;

    @Column(name = "homeTextPriceOne")
    private String homeTextPriceOne;

    @Column(name = "homeTextPriceTwo")
    private String homeTextPriceTwo;

    @Column(name = "homeTextPriceThree")
    private String homeTextPriceThree;

    @Column(name = "homeTextOneBulletOne")
    private String homeTextOneBulletOne;

    @Column(name = "homeTextOneBulletTwo")
    private String homeTextOneBulletTwo;

    @Column(name = "homeTextTwoBulletOne")
    private String homeTextTwoBulletOne;

    @Column(name = "homeTextTwoBulletTwo")
    private String homeTextTwoBulletTwo;

    @Column(name = "homeTextTwoBulletThree")
    private String homeTextTwoBulletThree;

    @Column(name = "homeTextTwoBulletFour")
    private String homeTextTwoBulletFour;

    @Column(name = "homeTextThreeBulletOne")
    private String homeTextThreeBulletOne;

    @Column(name = "homeTextThreeBulletTwo")
    private String homeTextThreeBulletTwo;

    @Column(name = "homeTextThreeBulletThree")
    private String homeTextThreeBulletThree;

    @Column(name = "homeTextThreeBulletFour")
    private String homeTextThreeBulletFour;

    @Column(name = "homeTextThreeBulletFive")
    private String homeTextThreeBulletFive;

    Hometext() {
    }

    Hometext(Integer homeTextId, String htBannerHeaderOne, String htBannerHeaderTwo, String htBannerDescription, String htBannerFooter, String htCallTop,
             String htCallBottom, String htContactHeader, String htContactDescription, String htFaqHeader, String htFaqDescription, String fq1, String fa1, String fq2, String fa2, String fq3,
             String fa3, String fq4, String fa4, String homeTextPriceHeader, String homeTextPriceOneH, String homeTextPriceTwoH, String homeTextPriceThreeH,
             String homeTextPriceOne, String homeTextPriceTwo, String homeTextPriceThree, String ht1b1, String ht1b2, String ht2b1, String ht2b2, String ht2b3, String ht2b4,
             String ht3b1, String ht3b2, String ht3b3, String ht3b4, String ht3b5) {
        this.homeTextId = homeTextId;
        this.homeTextBannerHeaderOne = htBannerHeaderOne;
        this.homeTextBannerHeaderTwo = htBannerHeaderTwo;
        this.homeTextBannerDescription = htBannerDescription;
        this.homeTextBannerFooter = htBannerFooter;
        this.homeTextCallTop = htCallTop;
        this.homeTextCallBottom = htCallBottom;
        this.homeTextContactHeader = htContactHeader;
        this.homeTextContactDescription = htContactDescription;
        this.homeTextFaqHeader = htFaqHeader;
        this.homeTextFaqDescription = htFaqDescription;
        this.homeTextFaqq1 = fq1;
        this.homeTextFaqa1 = fa1;
        this.homeTextFaqq2 = fq2;
        this.homeTextFaqa2 = fa2;
        this.homeTextFaqq3 = fq3;
        this.homeTextFaqa3 = fa3;
        this.homeTextFaqq4 = fq4;
        this.homeTextFaqa4 = fa4;
        this.homeTextPricingHeader = homeTextPriceHeader;
        this.homeTextPriceOneHeader = homeTextPriceOneH;
        this.homeTextPriceTwoHeader = homeTextPriceTwoH;
        this.homeTextPriceThreeHeader = homeTextPriceThreeH;
        this.homeTextPriceOne = homeTextPriceOne;
        this.homeTextPriceTwo = homeTextPriceTwo;
        this.homeTextPriceThree = homeTextPriceThree;
        this.homeTextOneBulletOne = ht1b1;
        this.homeTextOneBulletTwo = ht1b2;
        this.homeTextTwoBulletOne = ht2b1;
        this.homeTextTwoBulletTwo = ht2b2;
        this.homeTextTwoBulletThree = ht2b3;
        this.homeTextTwoBulletFour = ht2b4;
        this.homeTextThreeBulletOne = ht3b1;
        this.homeTextThreeBulletTwo = ht3b2;
        this.homeTextThreeBulletThree = ht3b3;
        this.homeTextThreeBulletFour = ht3b4;
        this.homeTextThreeBulletFive = ht3b5;
    }

    public Integer getHometextId() {
        return homeTextId;
    }

    public void setHometextId(Integer hometextId) {
        this.homeTextId = hometextId;
    }

    public String getHometextBannerHeaderOne() {
        return homeTextBannerHeaderOne;
    }

    public void setHometextBannerHeaderOne(String hometextBannerHeaderOne) {
        this.homeTextBannerHeaderOne = hometextBannerHeaderOne;
    }

    public String getHometextBannerHeaderTwo() {
        return homeTextBannerHeaderTwo;
    }

    public void setHometextBannerHeaderTwo(String hometextBannerHeaderTwo) {
        this.homeTextBannerHeaderTwo = hometextBannerHeaderTwo;
    }

    public String getHometextBannerDescription() {
        return homeTextBannerDescription;
    }

    public void setHometextBannerDescription(String hometextBannerDescription) {
        this.homeTextBannerDescription = hometextBannerDescription;
    }

    public String getHometextBannerFooter() {
        return homeTextBannerFooter;
    }

    public void setHometextBannerFooter(String hometextBannerFooter) {
        this.homeTextBannerFooter = hometextBannerFooter;
    }

    public String getHometextCallTop() {
        return homeTextCallTop;
    }

    public void setHometextCallTop(String hometextCallTop) {
        this.homeTextCallTop = hometextCallTop;
    }

    public String getHometextCallBottom() {
        return homeTextCallBottom;
    }

    public void setHometextCallBottom(String hometextCallBottom) {
        this.homeTextCallBottom = hometextCallBottom;
    }

    public String getHomeTextContactHeader() {
        return homeTextContactHeader;
    }

    public void setHomeTextContactHeader(String homeTextContactHeader) {
        this.homeTextContactHeader = homeTextContactHeader;
    }

    public String getHomeTextContactDescription() {
        return homeTextContactDescription;
    }

    public void setHomeTextContactDescription(String homeTextContactDescription) {
        this.homeTextContactDescription = homeTextContactDescription;
    }

    public String getHometextFaqHeader() {
        return homeTextFaqHeader;
    }

    public void setHometextFaqHeader(String hometextFaqHeader) {
        this.homeTextFaqHeader = hometextFaqHeader;
    }

    public String getHometextFaqDescription() {
        return homeTextFaqDescription;
    }

    public void setHometextFaqDescription(String hometextFaqDescription) {
        this.homeTextFaqDescription = hometextFaqDescription;
    }

    public String getHometextFaqA1() {
        return homeTextFaqa1;
    }

    public void setHometextFaqA1(String hometextFaqA1) {
        this.homeTextFaqa1 = hometextFaqA1;
    }

    public String getHometextFaqA2() {
        return homeTextFaqa2;
    }

    public void setHometextFaqA2(String hometextFaqA2) {
        this.homeTextFaqa2 = hometextFaqA2;
    }

    public String getHometextFaqA3() {
        return homeTextFaqa3;
    }

    public void setHometextFaqA3(String hometextFaqA3) {
        this.homeTextFaqa3 = hometextFaqA3;
    }

    public String getHometextFaqA4() {
        return homeTextFaqa4;
    }

    public void setHometextFaqA4(String hometextFaqA4) {
        this.homeTextFaqa4 = hometextFaqA4;
    }

    public String getHometextFaqQ1() {
        return homeTextFaqq1;
    }

    public void setHometextFaqQ1(String hometextFaqQ1) {
        this.homeTextFaqq1 = hometextFaqQ1;
    }

    public String getHometextFaqQ2() {
        return homeTextFaqq2;
    }

    public void setHometextFaqQ2(String hometextFaqQ2) {
        this.homeTextFaqq2 = hometextFaqQ2;
    }

    public String getHometextFaqQ3() {
        return homeTextFaqq3;
    }

    public void setHometextFaqQ3(String hometextFaqQ3) {
        this.homeTextFaqq3 = hometextFaqQ3;
    }

    public String getHometextFaqQ4() {
        return homeTextFaqq4;
    }

    public void setHometextFaqQ4(String hometextFaqQ4) {
        this.homeTextFaqq4 = hometextFaqQ4;
    }

    public String getHomeTextPricingHeader() {
        return homeTextPricingHeader;
    }

    public void setHomeTextPricingHeader(String homeTextPricingHeader) {
        this.homeTextPricingHeader = homeTextPricingHeader;
    }

    public String getHomeTextPriceOneHeader() {
        return homeTextPriceOneHeader;
    }

    public void setHomeTextPriceOneHeader(String homeTextPriceOneHeader) {
        this.homeTextPriceOneHeader = homeTextPriceOneHeader;
    }

    public String getHomeTextPriceTwoHeader() {
        return homeTextPriceTwoHeader;
    }

    public void setHomeTextPriceTwoHeader(String homeTextPriceTwoHeader) {
        this.homeTextPriceTwoHeader = homeTextPriceTwoHeader;
    }

    public String getHomeTextPriceThreeHeader() {
        return homeTextPriceThreeHeader;
    }

    public void setHomeTextPriceThreeHeader(String homeTextPriceThreeHeader) {
        this.homeTextPriceThreeHeader = homeTextPriceThreeHeader;
    }

    public String getHomeTextPriceOne() {
        return homeTextPriceOne;
    }

    public void setHomeTextPriceOne(String homeTextPriceOne) {
        this.homeTextPriceOne = homeTextPriceOne;
    }

    public String getHomeTextPriceTwo() {
        return homeTextPriceTwo;
    }

    public void setHomeTextPriceTwo(String homeTextPriceTwo) {
        this.homeTextPriceTwo = homeTextPriceTwo;
    }

    public String getHomeTextPriceThree() {
        return homeTextPriceThree;
    }

    public void setHomeTextPriceThree(String homeTextPriceThree) {
        this.homeTextPriceThree = homeTextPriceThree;
    }

    public String getHomeTextOneBulletOne() {
        return homeTextOneBulletOne;
    }

    public void setHomeTextOneBulletOne(String homeTextOneBulletOne) {
        this.homeTextOneBulletOne = homeTextOneBulletOne;
    }

    public String getHomeTextOneBulletTwo() {
        return homeTextOneBulletTwo;
    }

    public void setHomeTextOneBulletTwo(String homeTextOneBulletTwo) {
        this.homeTextOneBulletTwo = homeTextOneBulletTwo;
    }

    public String getHomeTextTwoBulletOne() {
        return homeTextTwoBulletOne;
    }

    public void setHomeTextTwoBulletOne(String homeTextTwoBulletOne) {
        this.homeTextTwoBulletOne = homeTextTwoBulletOne;
    }

    public String getHomeTextTwoBulletTwo() {
        return homeTextTwoBulletTwo;
    }

    public void setHomeTextTwoBulletTwo(String homeTextTwoBulletTwo) {
        this.homeTextTwoBulletTwo = homeTextTwoBulletTwo;
    }

    public String getHomeTextTwoBulletThree() {
        return homeTextTwoBulletThree;
    }

    public void setHomeTextTwoBulletThree(String homeTextTwoBulletThree) {
        this.homeTextTwoBulletThree = homeTextTwoBulletThree;
    }

    public String getHomeTextTwoBulletFour() {
        return homeTextTwoBulletFour;
    }

    public void setHomeTextTwoBulletFour(String homeTextTwoBulletFour) {
        this.homeTextTwoBulletFour = homeTextTwoBulletFour;
    }

    public String getHomeTextThreeBulletOne() {
        return homeTextThreeBulletOne;
    }

    public void setHomeTextThreeBulletOne(String homeTextThreeBulletOne) {
        this.homeTextThreeBulletOne = homeTextThreeBulletOne;
    }

    public String getHomeTextThreeBulletTwo() {
        return homeTextThreeBulletTwo;
    }

    public void setHomeTextThreeBulletTwo(String homeTextThreeBulletTwo) {
        this.homeTextThreeBulletTwo = homeTextThreeBulletTwo;
    }

    public String getHomeTextThreeBulletThree() {
        return homeTextThreeBulletThree;
    }

    public void setHomeTextThreeBulletThree(String homeTextThreeBulletThree) {
        this.homeTextThreeBulletThree = homeTextThreeBulletThree;
    }

    public String getHomeTextThreeBulletFour() {
        return homeTextThreeBulletFour;
    }

    public void setHomeTextThreeBulletFour(String homeTextThreeBulletFour) {
        this.homeTextThreeBulletFour = homeTextThreeBulletFour;
    }

    public String getHomeTextThreeBulletFive() {
        return homeTextThreeBulletFive;
    }

    public void setHomeTextThreeBulletFive(String homeTextThreeBulletFive) {
        this.homeTextThreeBulletFive = homeTextThreeBulletFive;
    }
}


