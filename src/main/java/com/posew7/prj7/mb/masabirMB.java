package com.posew7.prj7.mb;

import com.posew7.prj7.entity.Masabir;
import com.posew7.prj7.entity.Menu;
import com.posew7.prj7.sesion.MasabirFacade;
import com.posew7.prj7.sesion.MenuFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

@Named(value = "masabirMB")
@SessionScoped
public class masabirMB implements Serializable {

    @EJB
    private MasabirFacade masabirFacade;

    @EJB
    private MenuFacade menuFacade;

    private int no;
    private String isim;
    private int fiyat;
    private int toplam = 0;

    Menu m = new Menu();
    Masabir mbir = new Masabir();

    public masabirMB() {
    }

    public int getToplam() {
        return toplam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String kola() {
        isim = "kola";
        m = menuFacade.find(1);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        listele();
        return "";
    }

    public String fanta() {
        isim = "fanta";
        m = menuFacade.find(2);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String sprite() {
        isim = "sprite";
        m = menuFacade.find(3);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String icetea() {
        isim = "ice tea";
        m = menuFacade.find(4);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String ayran() {
        isim = "ayran";
        m = menuFacade.find(5);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String soda() {
        isim = "soda";
        m = menuFacade.find(6);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String kucuksu() {
        isim = "küçük su";
        m = menuFacade.find(7);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String buyuksu() {
        isim = "büyük su";
        m = menuFacade.find(8);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String hamburger() {
        isim = "hamburger";
        m = menuFacade.find(9);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String cizburger() {
        isim = "çizburger";
        m = menuFacade.find(10);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String cips() {
        isim = "cips";
        m = menuFacade.find(11);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String izgarakofte() {
        isim = "ızgara köfte";
        m = menuFacade.find(12);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String izgaratavuk() {
        isim = "ızgara tavuk";
        m = menuFacade.find(13);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String tavuksis() {
        isim = "tavuk şiş";
        m = menuFacade.find(14);
        fiyat = m.getFiyat();
        toplam += fiyat;
        mbir.setFiyat(fiyat);
        mbir.setIsim(isim);
        masabirFacade.create(mbir);
        return "";
    }

    public String sifirla() {

        return "";
    }

    public List<Masabir> listele() {

        return masabirFacade.findAll();

    }

}
