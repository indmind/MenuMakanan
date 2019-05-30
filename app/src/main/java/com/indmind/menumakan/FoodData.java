package com.indmind.menumakan;

import java.util.ArrayList;

public class FoodData {
    public static String[][] foods_menu = new String[][]{
            {
                    "Soto Betawi",
                    "Rp 20.000",
                    "Nikmati rasa yang enak",
                    "Warung Bang Juned",
                    "https://upload.wikimedia.org/wikipedia/id/b/b6/Soto_betawi.jpg"
            },
            {
                    "Gudeg",
                    "Rp 10.000",
                    "Rasakan rasa gudeg yang dimasak dengan waktu sangat singkat",
                    "Rm. Betawi",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Nasi_Gudeg.jpg/220px-Nasi_Gudeg.jpg"
            },
            {"Rawon",
                    "Rp 36.000",
                    "Besarnya daging bikin kenyang",
                    "Warung Mbok Nem",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Nasi_Rawon_A.JPG/220px-Nasi_Rawon_A.JPG"
            },
            {"Rujak Cingur",
                    "Rp 12.000",
                    "Pedasnya rujak bikin nagih",
                    "Rujak Bu Nur",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6f/Rujakcingur.jpg"
            },
            {"Rendang",
                    "Rp 40.000",
                    "Nikmati kayanya rempah rempah cita rasa Indonesia",
                    "Masakan Padang Ampera",
                    "https://upload.wikimedia.org/wikipedia/commons/7/70/Rendang_daging_sapi_asli_Padang.JPG"
            },
            {"Bakso",
                    "Rp 25.000",
                    "100% daging tanpa asli, dijamin!",
                    "Bakso Arief",
                    "https://upload.wikimedia.org/wikipedia/commons/2/28/Bakso_mi_bihun.jpg"
            }
    };

    public static ArrayList<Food> getFoodList() {
        Food food;

        ArrayList<Food> list = new ArrayList<>();

        for (String[] aFood : foods_menu) {
            food = new Food(aFood[0], aFood[1], aFood[2], aFood[3], aFood[4]);

            list.add(food);
        }

        return list;
    }
}
