package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // Bu bize CukesRunner calistirir bu clas olmasa cukesRunneri calistiramayiz.
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                 "rerun:target/rerun.txt"

        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false, //testlerimizi calistirdigimizda true oder folse durumuna göre iki farkli yol ile calistiriyor.
        tags = "@Rerun" // Böyle yazarak ile istedigimiz clasi yazip calistirmasini sagliyor.
                        // ' and ' javadaki ve mantigi gibi calisir her iki sartin da oldugu classlari calistirir.
                        // ' or ' javadaki veya mantigi gibi calisir en az bir tane de varsa onlari cagirir.
                        // ' and not ' bu ise istedigimiz classi calistirir ama önüne not koydugumuz classi calistirmaz.
                        // Vorne version für 4  and-->  {"@Smoke" and @Wip"} Benutzt
                        // Vorne version für 5 or --> "@Smoke,@Wip" --> Benutz
                        // Vorne version 5 and not --> {"@Smoke","Wip"} --> Benutz

)

public class CukesRunner {      // Testimizi kosturacak yani run olan yer burasidir.

}
