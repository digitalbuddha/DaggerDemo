package com.digitalbuddha.daggerdemo.job;

import com.digitalbuddha.daggerdemo.model.SavingsType;
import com.google.gson.Gson;
import com.path.android.jobqueue.Job;
import com.path.android.jobqueue.Params;

import java.util.List;

import de.greenrobot.event.EventBus;

/**
 * Created by MikeN on 9/8/14.
 */
public class GetSavingTypesJob extends Job {

    public List<SavingsType> savingsTypes;

    public GetSavingTypesJob() {
//        super(new Params(2)
//                .requireNetwork()
//                .groupBy("Repos"));
        super(new Params(0));
    }

    @Override
    public void onAdded() {
    }

    @Override
    public void onRun() throws Throwable {
        savingsTypes = new Gson().fromJson(json, List.class);
        EventBus.getDefault().post(this); //post the job instead of making dummy event pojos
    }
    //
    @Override
    protected void onCancel() {
        throw new RuntimeException();
    }
    //don't retry on error
    @Override
    protected boolean shouldReRunOnThrowable(Throwable throwable) {
        return false;
    }
    private static String json="[{\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketravelaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketraveladd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketravelback.png\",\"color\":\"#ffdd5ec7\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketraveldelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketraveledit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketravel.png\",\"id\":\"biketravel\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/biketravelnext.png\",\"title\":\"Travel more by bike\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasback.png\",\"color\":\"#ff0d9038\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmas.png\",\"id\":\"budgetchristmas\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/budgetchristmasnext.png\",\"title\":\"Set a spending limit on Holidays\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulkaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulkadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulkback.png\",\"color\":\"#ff4d9eed\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulkdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulkedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulk.png\",\"id\":\"buyinbulk\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/buyinbulknext.png\",\"title\":\"Buy staples in bulk\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsback.png\",\"color\":\"#ff1a05f2\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptions.png\",\"id\":\"cancelunreadsubscriptions\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cancelunreadsubscriptionsnext.png\",\"title\":\"Cancel Unread Magazine Subscriptions\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpoolaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpooladd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpoolback.png\",\"color\":\"#ff282a9e\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpooldelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpooledit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpool.png\",\"id\":\"carpool\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/carpoolnext.png\",\"title\":\"Car pool\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfoodaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfoodadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfoodback.png\",\"color\":\"#ffff4d74\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfooddelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfoodedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfood.png\",\"id\":\"cookfood\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/cookfoodnext.png\",\"title\":\"Cook at home\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcardaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcardadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcardback.png\",\"color\":\"#fff15151\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcarddelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcardedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcard.png\",\"id\":\"creditcard\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/creditcardnext.png\",\"title\":\"Avoid credit card interest\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangeback.png\",\"color\":\"#ff3645dd\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychange.png\",\"id\":\"dailychange\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/dailychangenext.png\",\"title\":\"Save small change\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessback.png\",\"color\":\"#ff5c61ee\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinkless.png\",\"id\":\"drinkless\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/drinklessnext.png\",\"title\":\"Drink less\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomeback.png\",\"color\":\"#ffe01f1f\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathome.png\",\"id\":\"entertainathome\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/entertainathomenext.png\",\"title\":\"Entertain at home\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreeback.png\",\"color\":\"#ff19375a\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfree.png\",\"id\":\"excerciseforfree\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/excerciseforfreenext.png\",\"title\":\"Excercise for Free\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymback.png\",\"color\":\"#ff2f21d3\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegym.png\",\"id\":\"homegym\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homegymnext.png\",\"title\":\"Build a Home Gym\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsback.png\",\"color\":\"#fffa8b9d\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegifts.png\",\"id\":\"homemadegifts\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/homemadegiftsnext.png\",\"title\":\"Give home made gifts\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazonaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazonadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazonback.png\",\"color\":\"#ff42a691\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazondelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazonedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazon.png\",\"id\":\"lessamazon\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessamazonnext.png\",\"title\":\"Spend less on Amazon\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktailaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktailadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktailback.png\",\"color\":\"#ff40c239\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktaildelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktailedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktail.png\",\"id\":\"lesscocktail\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscocktailnext.png\",\"title\":\"Drink less expensive drinks\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesback.png\",\"color\":\"#ff35effb\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothes.png\",\"id\":\"lessclothes\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessclothesnext.png\",\"title\":\"Buy less clothes\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingback.png\",\"color\":\"#ff7a2996\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshopping.png\",\"id\":\"lessshopping\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoppingnext.png\",\"title\":\"Cut down on shopping\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeeback.png\",\"color\":\"#fff1fc3d\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffee.png\",\"id\":\"lesscoffee\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesscoffeenext.png\",\"title\":\"Less takeaway coffee\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsback.png\",\"color\":\"#ffbd10e0\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproducts.png\",\"id\":\"lessproducts\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessproductsnext.png\",\"title\":\"Buy less beauty products\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesback.png\",\"color\":\"#ff5f37b2\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoes.png\",\"id\":\"lessshoes\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lessshoesnext.png\",\"title\":\"Buy less shoes\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsback.png\",\"color\":\"#ffd01b19\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreats.png\",\"id\":\"lesssweettreats\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesssweettreatsnext.png\",\"title\":\"Less sweet treats\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutback.png\",\"color\":\"#ffe9238e\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeout.png\",\"id\":\"lesstakeout\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/lesstakeoutnext.png\",\"title\":\"Less takeaway meals\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomeback.png\",\"color\":\"#ff8f11fe\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathome.png\",\"id\":\"makecoffeeathome\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/makecoffeeathomenext.png\",\"title\":\"Make coffee at home\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomeaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomeadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomeback.png\",\"color\":\"#ff4d4848\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomeedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathome.png\",\"id\":\"moviesathome\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/moviesathomenext.png\",\"title\":\"Watch movies at home\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketback.png\",\"color\":\"#ff2c7580\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticket.png\",\"id\":\"planeticket\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/planeticketnext.png\",\"title\":\"Shop around for cheaper travel\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechback.png\",\"color\":\"#ff06f6cd\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtech.png\",\"id\":\"refurbishedtech\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/refurbishedtechnext.png\",\"title\":\"Buy refurbished gadgets over new ones\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesback.png\",\"color\":\"#ff167eb7\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothes.png\",\"id\":\"secondhandclothes\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/secondhandclothesnext.png\",\"title\":\"Buy secondhand clothes\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsback.png\",\"color\":\"#ffbb283a\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmags.png\",\"id\":\"subscriptionsforregularmags\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/subscriptionsforregularmagsnext.png\",\"title\":\"Get a Subscription for Magazines You Buy Every Month\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitback.png\",\"color\":\"#ff167f24\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suit.png\",\"id\":\"suit\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/suitnext.png\",\"title\":\"Buy expensive but essential items in the sales\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchback.png\",\"color\":\"#ffeb2b45\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchdelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunch.png\",\"id\":\"takelunch\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/takelunchnext.png\",\"title\":\"Make lunch at home and take it with you\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tieaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tieadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tieback.png\",\"color\":\"#ff29a196\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tiedelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tieedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tie.png\",\"id\":\"tie\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/tienext.png\",\"title\":\"Find a cheaper alternative to labeled brands\"}, {\"accept\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxiaccept.png\",\"add\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxiadd.png\",\"back\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxiback.png\",\"color\":\"#fff6f344\",\"delete\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxidelete.png\",\"edit\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxiedit.png\",\"iconUrl\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxi.png\",\"id\":\"walknotaxi\",\"next\":\"https://raw.githubusercontent.com/PaddyBadger/TheBiggestSaver/master/mobile/src/main/res/drawable-xhdpi/walknotaxinext.png\",\"title\":\"Walk rather than taking taxis\"}]";
}
