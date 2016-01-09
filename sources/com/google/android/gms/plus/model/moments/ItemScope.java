// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.plus.internal.model.moments.ItemScopeEntity;
import java.util.*;

public interface ItemScope
    extends Freezable
{
    public static class Builder
    {

        public ItemScope build()
        {
            return new ItemScopeEntity(zzazD, zzazE, zzazF, zzazG, zzazH, zzazI, zzazJ, zzazK, zzazL, zzazM, zzazN, zzazO, zzazP, zzazQ, zzazR, zzazS, zzazT, zzql, zzazU, zzazV, zzazW, zzazX, zzadH, zzazY, zzazZ, zzaAa, zzaAb, zzaAc, zzaAd, zzaAe, zzaAf, zzGM, zzaAg, zzaAh, zzapL, zzaAi, zzapM, mName, zzaAj, zzaAk, zzaAl, zzaAm, zzaAn, zzaAo, zzaAp, zzaAq, zzaAr, zzaAs, zzaAt, zzaAu, zzaAv, zzAV, zzAX, zzaAw, zzaAx);
        }

        public Builder setAbout(ItemScope itemscope)
        {
            zzazE = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(2));
            return this;
        }

        public Builder setAdditionalName(List list)
        {
            zzazF = list;
            zzazD.add(Integer.valueOf(3));
            return this;
        }

        public Builder setAddress(ItemScope itemscope)
        {
            zzazG = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(4));
            return this;
        }

        public Builder setAddressCountry(String s)
        {
            zzazH = s;
            zzazD.add(Integer.valueOf(5));
            return this;
        }

        public Builder setAddressLocality(String s)
        {
            zzazI = s;
            zzazD.add(Integer.valueOf(6));
            return this;
        }

        public Builder setAddressRegion(String s)
        {
            zzazJ = s;
            zzazD.add(Integer.valueOf(7));
            return this;
        }

        public Builder setAssociated_media(List list)
        {
            zzazK = list;
            zzazD.add(Integer.valueOf(8));
            return this;
        }

        public Builder setAttendeeCount(int i)
        {
            zzazL = i;
            zzazD.add(Integer.valueOf(9));
            return this;
        }

        public Builder setAttendees(List list)
        {
            zzazM = list;
            zzazD.add(Integer.valueOf(10));
            return this;
        }

        public Builder setAudio(ItemScope itemscope)
        {
            zzazN = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(11));
            return this;
        }

        public Builder setAuthor(List list)
        {
            zzazO = list;
            zzazD.add(Integer.valueOf(12));
            return this;
        }

        public Builder setBestRating(String s)
        {
            zzazP = s;
            zzazD.add(Integer.valueOf(13));
            return this;
        }

        public Builder setBirthDate(String s)
        {
            zzazQ = s;
            zzazD.add(Integer.valueOf(14));
            return this;
        }

        public Builder setByArtist(ItemScope itemscope)
        {
            zzazR = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(15));
            return this;
        }

        public Builder setCaption(String s)
        {
            zzazS = s;
            zzazD.add(Integer.valueOf(16));
            return this;
        }

        public Builder setContentSize(String s)
        {
            zzazT = s;
            zzazD.add(Integer.valueOf(17));
            return this;
        }

        public Builder setContentUrl(String s)
        {
            zzql = s;
            zzazD.add(Integer.valueOf(18));
            return this;
        }

        public Builder setContributor(List list)
        {
            zzazU = list;
            zzazD.add(Integer.valueOf(19));
            return this;
        }

        public Builder setDateCreated(String s)
        {
            zzazV = s;
            zzazD.add(Integer.valueOf(20));
            return this;
        }

        public Builder setDateModified(String s)
        {
            zzazW = s;
            zzazD.add(Integer.valueOf(21));
            return this;
        }

        public Builder setDatePublished(String s)
        {
            zzazX = s;
            zzazD.add(Integer.valueOf(22));
            return this;
        }

        public Builder setDescription(String s)
        {
            zzadH = s;
            zzazD.add(Integer.valueOf(23));
            return this;
        }

        public Builder setDuration(String s)
        {
            zzazY = s;
            zzazD.add(Integer.valueOf(24));
            return this;
        }

        public Builder setEmbedUrl(String s)
        {
            zzazZ = s;
            zzazD.add(Integer.valueOf(25));
            return this;
        }

        public Builder setEndDate(String s)
        {
            zzaAa = s;
            zzazD.add(Integer.valueOf(26));
            return this;
        }

        public Builder setFamilyName(String s)
        {
            zzaAb = s;
            zzazD.add(Integer.valueOf(27));
            return this;
        }

        public Builder setGender(String s)
        {
            zzaAc = s;
            zzazD.add(Integer.valueOf(28));
            return this;
        }

        public Builder setGeo(ItemScope itemscope)
        {
            zzaAd = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(29));
            return this;
        }

        public Builder setGivenName(String s)
        {
            zzaAe = s;
            zzazD.add(Integer.valueOf(30));
            return this;
        }

        public Builder setHeight(String s)
        {
            zzaAf = s;
            zzazD.add(Integer.valueOf(31));
            return this;
        }

        public Builder setId(String s)
        {
            zzGM = s;
            zzazD.add(Integer.valueOf(32));
            return this;
        }

        public Builder setImage(String s)
        {
            zzaAg = s;
            zzazD.add(Integer.valueOf(33));
            return this;
        }

        public Builder setInAlbum(ItemScope itemscope)
        {
            zzaAh = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(34));
            return this;
        }

        public Builder setLatitude(double d)
        {
            zzapL = d;
            zzazD.add(Integer.valueOf(36));
            return this;
        }

        public Builder setLocation(ItemScope itemscope)
        {
            zzaAi = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(37));
            return this;
        }

        public Builder setLongitude(double d)
        {
            zzapM = d;
            zzazD.add(Integer.valueOf(38));
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            zzazD.add(Integer.valueOf(39));
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemscope)
        {
            zzaAj = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(40));
            return this;
        }

        public Builder setPerformers(List list)
        {
            zzaAk = list;
            zzazD.add(Integer.valueOf(41));
            return this;
        }

        public Builder setPlayerType(String s)
        {
            zzaAl = s;
            zzazD.add(Integer.valueOf(42));
            return this;
        }

        public Builder setPostOfficeBoxNumber(String s)
        {
            zzaAm = s;
            zzazD.add(Integer.valueOf(43));
            return this;
        }

        public Builder setPostalCode(String s)
        {
            zzaAn = s;
            zzazD.add(Integer.valueOf(44));
            return this;
        }

        public Builder setRatingValue(String s)
        {
            zzaAo = s;
            zzazD.add(Integer.valueOf(45));
            return this;
        }

        public Builder setReviewRating(ItemScope itemscope)
        {
            zzaAp = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(46));
            return this;
        }

        public Builder setStartDate(String s)
        {
            zzaAq = s;
            zzazD.add(Integer.valueOf(47));
            return this;
        }

        public Builder setStreetAddress(String s)
        {
            zzaAr = s;
            zzazD.add(Integer.valueOf(48));
            return this;
        }

        public Builder setText(String s)
        {
            zzaAs = s;
            zzazD.add(Integer.valueOf(49));
            return this;
        }

        public Builder setThumbnail(ItemScope itemscope)
        {
            zzaAt = (ItemScopeEntity)itemscope;
            zzazD.add(Integer.valueOf(50));
            return this;
        }

        public Builder setThumbnailUrl(String s)
        {
            zzaAu = s;
            zzazD.add(Integer.valueOf(51));
            return this;
        }

        public Builder setTickerSymbol(String s)
        {
            zzaAv = s;
            zzazD.add(Integer.valueOf(52));
            return this;
        }

        public Builder setType(String s)
        {
            zzAV = s;
            zzazD.add(Integer.valueOf(53));
            return this;
        }

        public Builder setUrl(String s)
        {
            zzAX = s;
            zzazD.add(Integer.valueOf(54));
            return this;
        }

        public Builder setWidth(String s)
        {
            zzaAw = s;
            zzazD.add(Integer.valueOf(55));
            return this;
        }

        public Builder setWorstRating(String s)
        {
            zzaAx = s;
            zzazD.add(Integer.valueOf(56));
            return this;
        }

        private String mName;
        private String zzAV;
        private String zzAX;
        private String zzGM;
        private String zzaAa;
        private String zzaAb;
        private String zzaAc;
        private ItemScopeEntity zzaAd;
        private String zzaAe;
        private String zzaAf;
        private String zzaAg;
        private ItemScopeEntity zzaAh;
        private ItemScopeEntity zzaAi;
        private ItemScopeEntity zzaAj;
        private List zzaAk;
        private String zzaAl;
        private String zzaAm;
        private String zzaAn;
        private String zzaAo;
        private ItemScopeEntity zzaAp;
        private String zzaAq;
        private String zzaAr;
        private String zzaAs;
        private ItemScopeEntity zzaAt;
        private String zzaAu;
        private String zzaAv;
        private String zzaAw;
        private String zzaAx;
        private String zzadH;
        private double zzapL;
        private double zzapM;
        private final Set zzazD = new HashSet();
        private ItemScopeEntity zzazE;
        private List zzazF;
        private ItemScopeEntity zzazG;
        private String zzazH;
        private String zzazI;
        private String zzazJ;
        private List zzazK;
        private int zzazL;
        private List zzazM;
        private ItemScopeEntity zzazN;
        private List zzazO;
        private String zzazP;
        private String zzazQ;
        private ItemScopeEntity zzazR;
        private String zzazS;
        private String zzazT;
        private List zzazU;
        private String zzazV;
        private String zzazW;
        private String zzazX;
        private String zzazY;
        private String zzazZ;
        private String zzql;

        public Builder()
        {
        }
    }


    public abstract ItemScope getAbout();

    public abstract List getAdditionalName();

    public abstract ItemScope getAddress();

    public abstract String getAddressCountry();

    public abstract String getAddressLocality();

    public abstract String getAddressRegion();

    public abstract List getAssociated_media();

    public abstract int getAttendeeCount();

    public abstract List getAttendees();

    public abstract ItemScope getAudio();

    public abstract List getAuthor();

    public abstract String getBestRating();

    public abstract String getBirthDate();

    public abstract ItemScope getByArtist();

    public abstract String getCaption();

    public abstract String getContentSize();

    public abstract String getContentUrl();

    public abstract List getContributor();

    public abstract String getDateCreated();

    public abstract String getDateModified();

    public abstract String getDatePublished();

    public abstract String getDescription();

    public abstract String getDuration();

    public abstract String getEmbedUrl();

    public abstract String getEndDate();

    public abstract String getFamilyName();

    public abstract String getGender();

    public abstract ItemScope getGeo();

    public abstract String getGivenName();

    public abstract String getHeight();

    public abstract String getId();

    public abstract String getImage();

    public abstract ItemScope getInAlbum();

    public abstract double getLatitude();

    public abstract ItemScope getLocation();

    public abstract double getLongitude();

    public abstract String getName();

    public abstract ItemScope getPartOfTVSeries();

    public abstract List getPerformers();

    public abstract String getPlayerType();

    public abstract String getPostOfficeBoxNumber();

    public abstract String getPostalCode();

    public abstract String getRatingValue();

    public abstract ItemScope getReviewRating();

    public abstract String getStartDate();

    public abstract String getStreetAddress();

    public abstract String getText();

    public abstract ItemScope getThumbnail();

    public abstract String getThumbnailUrl();

    public abstract String getTickerSymbol();

    public abstract String getType();

    public abstract String getUrl();

    public abstract String getWidth();

    public abstract String getWorstRating();

    public abstract boolean hasAbout();

    public abstract boolean hasAdditionalName();

    public abstract boolean hasAddress();

    public abstract boolean hasAddressCountry();

    public abstract boolean hasAddressLocality();

    public abstract boolean hasAddressRegion();

    public abstract boolean hasAssociated_media();

    public abstract boolean hasAttendeeCount();

    public abstract boolean hasAttendees();

    public abstract boolean hasAudio();

    public abstract boolean hasAuthor();

    public abstract boolean hasBestRating();

    public abstract boolean hasBirthDate();

    public abstract boolean hasByArtist();

    public abstract boolean hasCaption();

    public abstract boolean hasContentSize();

    public abstract boolean hasContentUrl();

    public abstract boolean hasContributor();

    public abstract boolean hasDateCreated();

    public abstract boolean hasDateModified();

    public abstract boolean hasDatePublished();

    public abstract boolean hasDescription();

    public abstract boolean hasDuration();

    public abstract boolean hasEmbedUrl();

    public abstract boolean hasEndDate();

    public abstract boolean hasFamilyName();

    public abstract boolean hasGender();

    public abstract boolean hasGeo();

    public abstract boolean hasGivenName();

    public abstract boolean hasHeight();

    public abstract boolean hasId();

    public abstract boolean hasImage();

    public abstract boolean hasInAlbum();

    public abstract boolean hasLatitude();

    public abstract boolean hasLocation();

    public abstract boolean hasLongitude();

    public abstract boolean hasName();

    public abstract boolean hasPartOfTVSeries();

    public abstract boolean hasPerformers();

    public abstract boolean hasPlayerType();

    public abstract boolean hasPostOfficeBoxNumber();

    public abstract boolean hasPostalCode();

    public abstract boolean hasRatingValue();

    public abstract boolean hasReviewRating();

    public abstract boolean hasStartDate();

    public abstract boolean hasStreetAddress();

    public abstract boolean hasText();

    public abstract boolean hasThumbnail();

    public abstract boolean hasThumbnailUrl();

    public abstract boolean hasTickerSymbol();

    public abstract boolean hasType();

    public abstract boolean hasUrl();

    public abstract boolean hasWidth();

    public abstract boolean hasWorstRating();
}
