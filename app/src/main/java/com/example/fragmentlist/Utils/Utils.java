package com.example.fragmentlist.Utils;

import com.example.fragmentlist.models.Mail;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Mail> generateDummyMails(){
        return new ArrayList<Mail>(){{
           add(new Mail("Nuevo Uniforme","Se les notifica a nuestros colaboradores sobre los nuevos uniformes para laborar","rh@mail.com"));
           add(new Mail("Queja","Las inconformidades con esta subgerencia provienen desde hace ya mucho tiempo, cuando se nos empezó a castigar dejándonos sin servicios en la banca.","nuevo@mail.com"));
           add(new Mail("Buen inicio de semana","Buenos días ingeniero, le deseo un buen inicio de semana, esperando que sea excelente todo lo que haga.","laputita@mail.com"));
           add(new Mail("Documentos pendientes","Buenos días ingeniero, tenemos pendientes por ahi algunos documentos por firmar, esperando que me pueda contestar los mas prontoposible...","ald@mail.com"));
           add(new Mail("Revision externa","Buenos días, esperando que se encuentre bien quiero notificarle sobre la revision extener de los disppositivos colodados dentro de la empresa en donde....","rh@mail.com"));
           add(new Mail("Proxima auditoria","Se les notifica a nuestros colaboradores sobre la proxima auditoria que se ellvare a cabo el dia....","auditoria@mail.com"));
        }};
    }

}
