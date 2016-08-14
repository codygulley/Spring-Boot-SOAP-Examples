package hello;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();

    public Country findCountry(String name) {
        Assert.notNull(name);

        Country result = null;

        for (Country country : countries) {
            if (name.equals(country.getName())) {
                result = country;
            }
        }

        return result;
    }

    @PostConstruct
    public void initData() {

        Country af = new Country();
        af.setName("Afghanistan");
        af.setCapital("Kabul");
        af.setCurrency(Currency.AFN);
        af.setPopulation(32564342);
        countries.add(af);


        Country ala = new Country();
        ala.setName("Åland Islands");
        ala.setCapital("Mariehamn");
        ala.setCurrency(Currency.EUR);
        ala.setPopulation(29013);
        countries.add(ala);

        Country dz = new Country();
        dz.setName("Algeria");
        dz.setCapital("Algiers");
        dz.setCurrency(Currency.ALL);
        dz.setPopulation(2886026);
        countries.add(dz);

        Country al = new Country();
        al.setName("Albania");
        al.setCapital("Tirana");
        al.setCurrency(Currency.DZD);
        al.setPopulation(40400000);
        countries.add(al);


        Country as = new Country();
        as.setName("American Samoa");
        as.setCapital("Pago Pago");
        as.setCurrency(Currency.USD);
        as.setPopulation(54343);
        countries.add(as);


        Country ad = new Country();
        ad.setName("Andorra");
        ad.setCapital("Andorra la Vella");
        ad.setCurrency(Currency.EUR);
        ad.setPopulation(85470);
        countries.add(ad);


        Country ao = new Country();
        ao.setName("Angola");
        ao.setCapital("Luanda");
        ao.setCurrency(Currency.AOA);
        ao.setPopulation(25789024);
        countries.add(ao);

        Country ai = new Country();
        ai.setName("Anguilla");
        ai.setCapital("The Valley");
        ai.setCurrency(Currency.XCD);
        ai.setPopulation(13600);
        countries.add(ai);

        Country aq = new Country();
        aq.setName("Antarctica");
        aq.setCapital("");
        aq.setPopulation(135);
        countries.add(aq);

        Country ag = new Country();
        ag.setName("Antigua and Barbuda");
        ag.setCapital("St. John's");
        ag.setCurrency(Currency.XCD);
        ag.setPopulation(91295);
        countries.add(ag);

        Country ar = new Country();
        ar.setName("Argentina");
        ar.setCapital("Buenos Aires");
        ar.setCurrency(Currency.ARS);
        ar.setPopulation(43417000);
        countries.add(ar);

        Country am = new Country();
        am.setName("Armenia");
        am.setCapital("Yerevan");
        am.setCurrency(Currency.AMD);
        am.setPopulation(2998600);
        countries.add(am);

        Country aw = new Country();
        aw.setName("Aruba");
        aw.setCapital("Oranjestad");
        aw.setCurrency(Currency.AWG);
        aw.setPopulation(103400);
        countries.add(aw);

        Country au = new Country();
        au.setName("Australia");
        au.setCapital("Canberra");
        au.setCurrency(Currency.AUD);
        au.setPopulation(24157200);
        countries.add(au);

        Country at = new Country();
        at.setName("Austria");
        at.setCapital("Vienna");
        at.setCurrency(Currency.EUR);
        at.setPopulation(8725931);
        countries.add(at);

        Country az = new Country();
        az.setName("Azerbaijan");
        az.setCapital("Baku");
        az.setCurrency(Currency.AZN);
        az.setPopulation(9754830);
        countries.add(az);


        Country bs = new Country();
        bs.setName("Bahamas");
        bs.setCapital("Nassau");
        bs.setCurrency(Currency.BSD);
        bs.setPopulation(321834);
        countries.add(bs);


        Country bh = new Country();
        bh.setName("Bahrain");
        bh.setCapital("Manama");
        bh.setCurrency(Currency.BHD);
        bh.setPopulation(1378000);
        countries.add(bh);


        Country bb = new Country();
        bb.setName("Barbados");
        bb.setCapital("Bridgetown");
        bb.setCurrency(Currency.BBD);
        bb.setPopulation(277821);
        countries.add(bb);


        Country by = new Country();
        by.setName("Belarus");
        by.setCapital("Minsk");
        by.setCurrency(Currency.BYN);
        by.setPopulation(94987000);
        countries.add(by);


        Country be = new Country();
        be.setName("Belgium");
        be.setCapital("Brussels");
        be.setCurrency(Currency.EUR);
        be.setPopulation(11250585);
        countries.add(be);


        Country bz = new Country();
        bz.setName("Belize");
        bz.setCapital("Belmopan");
        bz.setCurrency(Currency.BZD);
        bz.setPopulation(368310);
        countries.add(bz);


        Country bj = new Country();
        bj.setName("Benin");
        bj.setCapital("Porto-Novo");
        bj.setCurrency(Currency.XOF);
        bj.setPopulation(10879829);
        countries.add(bj);


        Country bm = new Country();
        bm.setName("Bermuda");
        bm.setCapital("Hamilton");
        bm.setCurrency(Currency.BMD);
        bm.setPopulation(64237);
        countries.add(bm);


        Country bt = new Country();
        bt.setName("Bhutan");
        bt.setCapital("Thimphu");
        bt.setCurrency(Currency.BTN);
        bt.setPopulation(742737);
        countries.add(bt);



        Country bo = new Country();
        bo.setName("Bolivia");
        bo.setCapital("Sucre");
        bo.setCurrency(Currency.BOB);
        bo.setPopulation(11410651);
        countries.add(bo);



        Country bq = new Country();
        bq.setName("Bonaire");
        bq.setCapital("Kralendijk");
        bq.setCurrency(Currency.USD);
        bq.setPopulation(17408);
        countries.add(bq);


        Country ba = new Country();
        ba.setName("Bosnia and Herzegovina");
        ba.setCapital("Sarajevo");
        ba.setCurrency(Currency.BAM);
        ba.setPopulation(3531159);
        countries.add(ba);


        Country bw = new Country();
        bw.setName("Botswana");
        bw.setCapital("Gaborone");
        bw.setCurrency(Currency.BWP);
        bw.setPopulation(2155784);
        countries.add(bw);

        Country bv = new Country();
        bv.setName("Bouvet Island");
        bv.setCapital("");
        bv.setPopulation(0);
        countries.add(bv);


        Country br = new Country();
        br.setName("Brazil");
        br.setCapital("Brasília");
        br.setCurrency(Currency.BRL);
        br.setPopulation(205338000);
        countries.add(br);


        Country io = new Country();
        io.setName("British Indian Ocean Territory");
        io.setCapital("");
        io.setCurrency(Currency.USD);
        io.setPopulation(3000);
        countries.add(io);

        Country bn = new Country();
        bn.setName("Brunei");
        bn.setCapital("Bandar Seri Begawan");
        bn.setCurrency(Currency.BND);
        bn.setPopulation(415717);
        countries.add(bn);

        Country bg = new Country();
        bg.setName("Bulgaria");
        bg.setCapital("Sofia");
        bg.setCurrency(Currency.BGN);
        bg.setPopulation(7202198);
        countries.add(bg);


        Country bf = new Country();
        bf.setName("Burkina Faso");
        bf.setCapital("Ouagadougou");
        bf.setCurrency(Currency.XOF);
        bf.setPopulation(17322796);
        countries.add(bf);


        Country bi = new Country();
        bi.setName("Burundi");
        bi.setCapital("Bujumbura");
        bi.setCurrency(Currency.BIF);
        bi.setPopulation(11178921);
        countries.add(bi);


        Country cv = new Country();
        cv.setName("Cabo Verde");
        cv.setCapital("Praia");
        cv.setCurrency(Currency.CVE);
        cv.setPopulation(525000);
        countries.add(cv);



        Country kh = new Country();
        kh.setName("Cambodia");
        kh.setCapital("Phnom Penh");
        kh.setCurrency(Currency.KHR);
        kh.setPopulation(15458332);
        countries.add(kh);



        Country cm = new Country();
        cm.setName("Cameroon");
        cm.setCapital("Yaoundé");
        cm.setCurrency(Currency.XAF);
        cm.setPopulation(22534532);
        countries.add(cm);


        Country ca = new Country();
        ca.setName("Canada");
        ca.setCapital("Ottawa");
        ca.setCurrency(Currency.CAD);
        ca.setPopulation(36155487);
        countries.add(ca);

        Country ky = new Country();
        ky.setName("Cayman Islands");
        ky.setCapital("George Town");
        ky.setCurrency(Currency.KYD);
        ky.setPopulation(56732);
        countries.add(ky);


        Country cf = new Country();
        cf.setName("Central African Republic");
        cf.setCapital("Bangui");
        cf.setCurrency(Currency.XAF);
        cf.setPopulation(4709000);
        countries.add(cf);

        Country td = new Country();
        td.setName("Chad");
        td.setCapital("N'Djamena");
        td.setCurrency(Currency.XAF);
        td.setPopulation(13670084);
        countries.add(td);


        Country cl = new Country();
        cl.setName("Chile");
        cl.setCapital("Santiago");
        cl.setCurrency(Currency.CLP);
        cl.setPopulation(18006407);
        countries.add(cl);


        Country cn = new Country();
        cn.setName("China");
        cn.setCapital("Beijing");
        cn.setCurrency(Currency.CNY);
        cn.setPopulation(1339724852);
        countries.add(cn);



        Country cx = new Country();
        cx.setName("Christmas Islands");
        cx.setCapital("Flying Fish Cove");
        cx.setCurrency(Currency.AUD);
        cx.setPopulation(2072);
        countries.add(cx);

        Country cc = new Country();
        cc.setName("Cocos Islands");
        cc.setCapital("West Island");
        cc.setCurrency(Currency.AUD);
        cc.setPopulation(596);
        countries.add(cc);

        Country co = new Country();
        co.setName("Colombia");
        co.setCapital("Bogotá");
        co.setCurrency(Currency.COP);
        co.setPopulation(48786100);
        countries.add(co);

        Country km = new Country();
        km.setName("Comoros");
        km.setCapital("Moroni");
        km.setCurrency(Currency.KMF);
        km.setPopulation(798000);
        countries.add(km);

        Country cd = new Country();
        cd.setName("Democratic Republic of the Congo");
        cd.setCapital("Kinshasa");
        cd.setCurrency(Currency.CDF);
        cd.setPopulation(81680000);
        countries.add(cd);


        Country ck = new Country();
        ck.setName("Cook Islands");
        ck.setCapital("Avarua");
        ck.setCurrency(Currency.NZD);
        ck.setPopulation(14974);
        countries.add(ck);

        Country cr = new Country();
        cr.setName("Costa Rica");
        cr.setCapital("San José");
        cr.setCurrency(Currency.CRC);
        cr.setPopulation(4586353);
        countries.add(cr);


        Country ci = new Country();
        ci.setName("Côte d'Ivoire");
        ci.setCapital("Yamoussoukro");
        ci.setCurrency(Currency.XOF);
        ci.setPopulation(23919000);

        Country hr = new Country();
        hr.setName("Croatia");
        hr.setCapital("Zagreb");
        hr.setCurrency(Currency.HRK);
        hr.setPopulation(4190700);

        Country cu = new Country();
        cu.setName("Cuba");
        cu.setCapital("Havana");
        cu.setCurrency(Currency.CUP);
        cu.setPopulation(11239004);

        Country cw = new Country();
        cw.setName("Curaçao");
        cw.setCapital("Willemstad");
        cw.setCurrency(Currency.ANG);
        cw.setPopulation(154843);

        Country cy = new Country();
        cy.setName("Cyprus");
        cy.setCapital("Nicosia");
        cy.setCurrency(Currency.EUR);
        cy.setPopulation(1141166);

        Country cz = new Country();
        cz.setName("Czech Republic");
        cz.setCapital("Prague");
        cz.setCurrency(Currency.CZK);
        cz.setPopulation(10553443);

        //Need to update these to us ISO 3166 Alpha-2 Code

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.add(poland);

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.add(spain);



        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.add(uk);

        Country usa = new Country();
        usa.setName("United States of America");
        usa.setCapital("Washington D.C.");
        usa.setCurrency(Currency.USD);
        usa.setPopulation(324394946);

        countries.add(usa);

    }


}