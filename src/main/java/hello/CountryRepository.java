package hello;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();

    public Country findCountry(String name) throws Exception {
        Assert.notNull(name);

        Country result = null;

        for (Country country : countries) {
            if (name.equals(country.getName())) {
                result = country;
            }
        }
        if(result==null){
            throw new Exception("ERROR: Country \"" + name +"\" not found");
        }
        return result;
    }

    @PostConstruct
    public void initData() {
//Country information complied from https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
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
        aq.setCurrency(Currency.NOCURRENCY);
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
        countries.add(ci);

        Country hr = new Country();
        hr.setName("Croatia");
        hr.setCapital("Zagreb");
        hr.setCurrency(Currency.HRK);
        hr.setPopulation(4190700);
        countries.add(hr);

        Country cu = new Country();
        cu.setName("Cuba");
        cu.setCapital("Havana");
        cu.setCurrency(Currency.CUP);
        cu.setPopulation(11239004);
        countries.add(cu);

        Country cw = new Country();
        cw.setName("Curaçao");
        cw.setCapital("Willemstad");
        cw.setCurrency(Currency.ANG);
        cw.setPopulation(154843);
        countries.add(cw);

        Country cy = new Country();
        cy.setName("Cyprus");
        cy.setCapital("Nicosia");
        cy.setCurrency(Currency.EUR);
        cy.setPopulation(1141166);
        countries.add(cy);

        Country cz = new Country();
        cz.setName("Czech Republic");
        cz.setCapital("Prague");
        cz.setCurrency(Currency.CZK);
        cz.setPopulation(10553443);
        countries.add(cz);

        Country dk = new Country();
        dk.setName("Denmark");
        dk.setCapital("Copenhagen");
        dk.setCurrency(Currency.DKK);
        dk.setPopulation(5707251);
        countries.add(dk);

        Country dj = new Country();
        dj.setName("Djibouti");
        dj.setCapital("Djibouti City");
        dj.setCurrency(Currency.DJF);
        dj.setPopulation(828324);
        countries.add(dj);


        Country dm = new Country();
        dm.setName("Dominica");
        dm.setCapital("Roseau");
        dm.setCurrency(Currency.XCD);
        dm.setPopulation(72660);
        countries.add(dm);

        //this is not using the alpha code "do" as it is a java keyword
        Country dominicaRepublic = new Country();
        dominicaRepublic.setName("Dominican Republic");
        dominicaRepublic.setCapital("Santo Domingo");
        dominicaRepublic.setCurrency(Currency.DOP);
        dominicaRepublic.setPopulation(10075045);
        countries.add(dominicaRepublic);


        Country ec = new Country();
        ec.setName("Ecuador");
        ec.setCapital("Quito");
        ec.setCurrency(Currency.USD);
        ec.setPopulation(16144000);
        countries.add(ec);


        Country eg = new Country();
        eg.setName("Egypt");
        eg.setCapital("Cairo");
        eg.setCurrency(Currency.EGP);
        eg.setPopulation(91503000);
        countries.add(eg);


        Country sv = new Country();
        sv.setName("El Salvador");
        sv.setCapital("San Salvador");
        sv.setCurrency(Currency.USD);
        sv.setPopulation(6377195);
        countries.add(sv);

        Country gq = new Country();
        gq.setName("Equatorial Guinea");
        gq.setCapital("Malabo");
        gq.setCurrency(Currency.XAF);
        gq.setPopulation(1222442);
        countries.add(gq);

        Country er = new Country();
        er.setName("Eritrea");
        er.setCapital("Asmara");
        er.setCurrency(Currency.ERN);
        er.setPopulation(6380803);
        countries.add(er);

        Country ee = new Country();
        ee.setName("Estonia");
        ee.setCapital("Tallinn");
        ee.setCurrency(Currency.EUR);
        ee.setPopulation(1315944);
        countries.add(ee);

        Country et = new Country();
        et.setName("Ethiopia");
        et.setCapital("Addis Ababa");
        et.setCurrency(Currency.ETB);
        et.setPopulation(99465819);
        countries.add(et);

        Country fk = new Country();
        fk.setName("Falkland Islands");
        fk.setCapital("Stanley");
        fk.setCurrency(Currency.FKP);
        fk.setPopulation(2932);
        countries.add(fk);


        Country fo = new Country();
        fo.setName("Faroe Islands");
        fo.setCapital("Tórshavn");
        fo.setCurrency(Currency.DKK);
        fo.setPopulation(50196);
        countries.add(fo);


        Country fj = new Country();
        fj.setName("Fiji");
        fj.setCapital("Suva");
        fj.setCurrency(Currency.FJD);
        fj.setPopulation(909389);
        countries.add(fj);


        Country fi = new Country();
        fi.setName("Finland");
        fi.setCapital("Helsinki");
        fi.setCurrency(Currency.EUR);
        fi.setPopulation(5488543);
        countries.add(fi);

        Country fr = new Country();
        fr.setName("France");
        fr.setCapital("Paris");
        fr.setCurrency(Currency.EUR);
        fr.setPopulation(66736000);
        countries.add(fr);


        Country gf = new Country();
        gf.setName("French Guiana");
        gf.setCapital("Cayenne");
        gf.setCurrency(Currency.EUR);
        gf.setPopulation(259000);
        countries.add(gf);


        Country pf = new Country();
        pf.setName("French Polynesia");
        pf.setCapital("Pape'ete");
        pf.setCurrency(Currency.XPF);
        pf.setPopulation(268270);
        countries.add(pf);


        Country tf = new Country();
        tf.setName("French Southern Territories");
        tf.setCapital("\tSaint-Pierre");
        tf.setCurrency(Currency.EUR);
        tf.setPopulation(310);
        countries.add(tf);

        Country ga = new Country();
        ga.setName("Gabon");
        ga.setCapital("Libreville");
        ga.setPopulation(1475000);
        ga.setCurrency(Currency.XAF);
        countries.add(ga);

        Country gm = new Country();
        gm.setName("Gambia");
        gm.setCapital("Banjul");
        gm.setPopulation(1882450);
        gm.setCurrency(Currency.GMD);
        countries.add(gm);

        Country ge = new Country();
        ge.setName("Georgia");
        ge.setCapital("Tbilisi");
        ge.setPopulation(3720400);
        ge.setCurrency(Currency.GEL);
        countries.add(ge);

        Country de = new Country();
        de.setName("Germany");
        de.setCapital("Berlin");
        de.setPopulation(81770900);
        de.setCurrency(Currency.EUR);
        countries.add(de);

        Country gh = new Country();
        gh.setName("Ghana");
        gh.setCapital("Accra");
        gh.setCurrency(Currency.GHS);
        gh.setPopulation(27043093);
        countries.add(gh);

        Country gi = new Country();
        gi.setName("Gibraltar");
        gi.setCapital("Gibraltar");
        gi.setCurrency(Currency.GIP);
        gi.setPopulation(32194);
        countries.add(gi);

        Country gr = new Country();
        gr.setName("Greece");
        gr.setCapital("Athens");
        gr.setCurrency(Currency.EUR);
        gr.setPopulation(10955000);
        countries.add(gr);

        Country gl = new Country();
        gl.setName("Greenland");
        gl.setCapital("Nuuk");
        gl.setCurrency(Currency.DKK);
        gl.setPopulation(55847);
        countries.add(gl);

        Country gd = new Country();
        gd.setName("Grenada");
        gd.setCapital("St. George's");
        gd.setCurrency(Currency.XCD);
        gd.setPopulation(109590);
        countries.add(gd);

        Country gp = new Country();
        gp.setName("Guadeloupe");
        gp.setCapital("");
        gp.setCurrency(Currency.XPF);
        gp.setPopulation(403750);
        countries.add(gp);

        Country gu = new Country();
        gu.setName("Guam");
        gu.setCapital("Hagåtña");
        gu.setCurrency(Currency.USD);
        gu.setPopulation(161785);
        countries.add(gu);

        Country gt = new Country();
        gt.setName("Guatemala");
        gt.setCapital("Guatemala City");
        gt.setCurrency(Currency.GTQ);
        gt.setPopulation(15806675);
        countries.add(gt);

        Country gg = new Country();
        gg.setName("Guernsey");
        gg.setCapital("St. Peter Port");
        gg.setCurrency(Currency.GGP);
        gg.setPopulation(62711);
        countries.add(gg);

        Country gn = new Country();
        gn.setName("Guinea");
        gn.setCapital("Conakry");
        gn.setCurrency(Currency.GNF);
        gn.setPopulation(8746128);
        countries.add(gn);

        Country gw = new Country();
        gw.setName("Guinea-Bissau");
        gw.setCapital("Bissau");
        gw.setCurrency(Currency.XOF);
        gw.setPopulation(1693398);
        countries.add(gw);

        Country gy = new Country();
        gy.setName("Guyana");
        gy.setCapital("Georgetown");
        gy.setCurrency(Currency.GYD);
        gy.setPopulation(735554);
        countries.add(gy);

        Country ht = new Country();
        ht.setName("Haiti");
        ht.setCapital("Port-au-Prince");
        ht.setCurrency(Currency.HTG);
        ht.setPopulation(10604000);
        countries.add(ht);

        Country hm = new Country();
        hm.setName("Heard Island and McDonald Islands");
        hm.setCapital("");
        hm.setCurrency(Currency.AUD);
        hm.setPopulation(0);
        countries.add(hm);

        Country va = new Country();
        va.setName("Holy See");
        va.setCapital("Vatican City");
        va.setCurrency(Currency.EUR);
        va.setPopulation(1000);
        countries.add(va);

        Country hn = new Country();
        hn.setName("Honduras");
        hn.setCapital("Tegucigalpa");
        hn.setCurrency(Currency.HNL);
        hn.setPopulation(8249574);
        countries.add(hn);

        Country hk = new Country();
        hk.setName("Hong Kong");
        hk.setCapital("");
        hk.setCurrency(Currency.HKD);
        hk.setPopulation(7234800);
        countries.add(hk);

        Country hu = new Country();
        hu.setName("Hungary");
        hu.setCapital("Budapest");
        hu.setCurrency(Currency.HUF);
        hu.setPopulation(9855571);
        countries.add(hu);

        Country is = new Country();
        is.setName("Iceland");
        is.setCapital("Reykjavík");
        is.setCurrency(Currency.ISK);
        is.setPopulation(332529);
        countries.add(is);

        Country in = new Country();
        in.setName("India");
        in.setCapital("New Delhi");
        in.setCurrency(Currency.INR);
        in.setPopulation(1293057000);
        countries.add(in);

        Country id = new Country();
        id.setName("Indonesia");
        id.setCapital("Jakarta");
        id.setCurrency(Currency.IDR);
        id.setPopulation(255461700);
        countries.add(id);

        Country ir = new Country();
        ir.setName("Iran");
        ir.setCapital("Tehran");
        ir.setCurrency(Currency.IRR);
        ir.setPopulation(79460700);
        countries.add(ir);

        Country iq = new Country();
        iq.setName("Iraq");
        iq.setCapital("Baghdad");
        iq.setCurrency(Currency.IQD);
        iq.setPopulation(37056169);
        countries.add(iq);

        Country ie = new Country();
        ie.setName("Ireland");
        ie.setCapital("Dublin");
        ie.setCurrency(Currency.EUR);
        ie.setPopulation(4757976);
        countries.add(ie);

        Country im = new Country();
        im.setName("Isle of Man");
        im.setCapital("Douglas");
        im.setCurrency(Currency.GBP);
        countries.add(im);

        // TODO: 8/15/16 update
        Country il = new Country();
        il.setName("Israel");
        countries.add(il);


        Country it = new Country();
        it.setName("Italy");
        it.setCapital("Rome");
        it.setCurrency(Currency.EUR);
        it.setPopulation(60674003);
        countries.add(it);

        // TODO: 8/15/16 update
        Country jm = new Country();
        jm.setName("Jamaica");
        countries.add(jm);

        Country jp = new Country();
        jp.setName("Japan");
        jp.setCapital("Tokyo");
        jp.setCurrency(Currency.JPY);
        jp.setPopulation(126990000);
        countries.add(jp);

        // TODO: 8/15/16 update
        Country je = new Country();
        je.setName("Jersey");
        countries.add(je);

        // TODO: 8/15/16 update
        Country jo = new Country();
        jo.setName("Jordan");
        countries.add(jo);

        // TODO: 8/15/16 update
        Country kz = new Country();
        kz.setName("Kazakhstan");
        countries.add(kz);


        Country ke = new Country();
        ke.setName("Kenya");
        ke.setCapital("Nairobi");
        ke.setCurrency(Currency.KES);
        ke.setPopulation(44156577);
        countries.add(ke);

        // TODO: 8/15/16 update
        Country ki = new Country();
        ki.setName("Kiribati");
        countries.add(ki);

        // TODO: 8/15/16 update
        Country kp = new Country();
        kp.setName("North Korea");
        countries.add(kp);

        // TODO: 8/15/16 update
        Country kw = new Country();
        kw.setName("Kuwait");
        countries.add(kw);

        // TODO: 8/15/16 update
        Country kg = new Country();
        kg.setName("Kyrgyzstan");
        countries.add(kg);

        // TODO: 8/15/16 update
        Country la = new Country();
        la.setName("Lao");
        countries.add(la);

        // TODO: 8/15/16 update
        Country lv = new Country();
        lv.setName("Latvia");
        countries.add(lv);

        // TODO: 8/15/16 update
        Country lb = new Country();
        lb.setName("Lebanon");
        countries.add(lb);

        // TODO: 8/15/16 update
        Country ls = new Country();
        ls.setName("Lesotho");
        countries.add(ls);

        // TODO: 8/15/16 update
        Country lr = new Country();
        lr.setName("Liberia");
        countries.add(lr);

        // TODO: 8/15/16 update
        Country ly = new Country();
        ly.setName("Libya");
        countries.add(ly);

        // TODO: 8/15/16 update
        Country li = new Country();
        li.setName("Liechtenstein");
        countries.add(li);

        // TODO: 8/15/16 update
        Country lt = new Country();
        lt.setName("Lithuania");
        countries.add(lt);

        // TODO: 8/15/16 update
        Country lu = new Country();
        lu.setName("Luxembourg");
        countries.add(lu);

        Country mm = new Country();
        mm.setName("Myanmar");
        mm.setCapital("Naypyidaw");
        mm.setCurrency(Currency.MMK);
        mm.setPopulation(51486253);
        countries.add(mm);

        Country mx = new Country();
        mx.setName("Mexico");
        mx.setCapital("Mexico City");
        mx.setCurrency(Currency.MXN);
        mx.setPopulation(119530753);
        countries.add(mx);

        Country ng = new Country();
        ng.setName("Nigeria");
        ng.setCapital("Abuja");
        ng.setCurrency(Currency.NGN);
        ng.setPopulation(182202000);
        countries.add(ng);

        Country pk = new Country();
        pk.setName("Pakistan");
        pk.setCapital("Islamabad");
        pk.setCurrency(Currency.PKR);
        pk.setPopulation(202971003);
        countries.add(pk);

        Country ph = new Country();
        ph.setName("Philippines");
        ph.setCapital("Manila");
        ph.setCurrency(Currency.PHP);
        ph.setPopulation(102862000);
        countries.add(ph);

        Country pl = new Country();
        pl.setName("Poland");
        pl.setCapital("Warsaw");
        pl.setCurrency(Currency.PLN);
        pl.setPopulation(38186860);
        countries.add(pl);

        Country ru = new Country();
        ru.setName("Russia");
        ru.setCapital("Moscow");
        ru.setCurrency(Currency.RUB);
        ru.setPopulation(144192450);
        countries.add(ru);

        Country za = new Country();
        za.setName("South Africa");
        za.setCapital("Pretoria");
        za.setCurrency(Currency.ZAR);
        za.setPopulation(55653654);
        countries.add(za);

        Country kr = new Country();
        kr.setName("South Korea");
        kr.setCapital("Seoul");
        kr.setCurrency(Currency.KRW);
        kr.setPopulation(50801405);
        countries.add(kr);

        Country es = new Country();
        es.setName("Spain");
        es.setCapital("Madrid");
        es.setCurrency(Currency.EUR);
        es.setPopulation(46704314);
        countries.add(es);

        Country sd = new Country();
        sd.setName("Sudan");
        sd.setCapital("Khartoum");
        sd.setCurrency(Currency.SDG);
        sd.setPopulation(39598700);
        countries.add(sd);

        Country tz = new Country();
        tz.setName("Tanzania");
        tz.setCapital("Dodoma");
        tz.setCurrency(Currency.TZS);
        tz.setPopulation(48775567);
        countries.add(tz);

        Country th = new Country();
        th.setName("Thailand");
        th.setCapital("Bangkok");
        th.setCurrency(Currency.THB);
        th.setPopulation(65729098);
        countries.add(th);

        Country tr = new Country();
        tr.setName("Turkey");
        tr.setCapital("Istanbul");
        tr.setCurrency(Currency.TRY);
        tr.setPopulation(78741053);
        countries.add(tr);

        Country ug = new Country();
        ug.setName("Uganda");
        ug.setCapital("Kampala");
        ug.setCurrency(Currency.UGX);
        ug.setPopulation(37873253);
        countries.add(ug);

        Country ua = new Country();
        ua.setName("Ukraine");
        ua.setCapital("Kiev");
        ua.setCurrency(Currency.UAH);
        ua.setPopulation(42673911);
        countries.add(ua);

        Country gb = new Country();
        gb.setName("United Kingdom");
        gb.setCapital("London");
        gb.setCurrency(Currency.GBP);
        gb.setPopulation(63705000);
        countries.add(gb);

        Country us = new Country();
        us.setName("United States of America");
        us.setCapital("Washington D.C.");
        us.setCurrency(Currency.USD);
        us.setPopulation(324394946);
        countries.add(us);

        Country vn = new Country();
        vn.setName("Vietnam");
        vn.setCapital("Hanoi");
        vn.setCurrency(Currency.VND);
        vn.setPopulation(92700000);
        countries.add(vn);



    }


}