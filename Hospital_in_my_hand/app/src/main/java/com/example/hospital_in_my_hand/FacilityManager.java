package com.example.hospital_in_my_hand;

import java.util.ArrayList;
import java.util.List;

public class FacilityManager {
    //DAO
    List<FacilityVO> facilityVOList = new ArrayList<>();
    private static FacilityManager instance;
    public static FacilityManager getInstance(){
        if(instance == null){
            instance = new FacilityManager();
        }
        return instance;
    }
    private FacilityManager(){
//        String title, String content, int roodID, int coordinateX, int coordinateY, int floorNumber
        facilityVOList.add(new FacilityVO("감염내과","",1,237,136,1));
        facilityVOList.add(new FacilityVO("고객지원실","",2,318,293,1));
        facilityVOList.add(new FacilityVO("내분비대사과","",3,237,136,1));
        facilityVOList.add(new FacilityVO("류마티스내과","",4,166,136,1));
        facilityVOList.add(new FacilityVO("방사선종양학과","",5,113,354,1));

        facilityVOList.add(new FacilityVO("소화기내과","",6,480,136,1));
        facilityVOList.add(new FacilityVO("신경과","",7,427,136,1));
        facilityVOList.add(new FacilityVO("신경외과","",8,427,136,1));
        facilityVOList.add(new FacilityVO("신장내과","",9,237,136,1));
        facilityVOList.add(new FacilityVO("안내센터","",10,318,256,1));

        facilityVOList.add(new FacilityVO("영상의학과","",11,211,335,1));
        facilityVOList.add(new FacilityVO("응급의료센터","",12,323,352,1));
        facilityVOList.add(new FacilityVO("일반내과","",13,237,136,1));
        facilityVOList.add(new FacilityVO("외과","",14,480,136,1));
        facilityVOList.add(new FacilityVO("외래약국","",15,314,162,1));

        facilityVOList.add(new FacilityVO("재활센터","",16,84,134,1));
        facilityVOList.add(new FacilityVO("재활의학과","",17,166,136,1));
        facilityVOList.add(new FacilityVO("접수ㆍ수납","",18,314,122,1));
        facilityVOList.add(new FacilityVO("재증명","",19,369,115,1));
        facilityVOList.add(new FacilityVO("중앙주사실","",20,527,136,1));

        facilityVOList.add(new FacilityVO("정형외과","",21,166,136,1));
        facilityVOList.add(new FacilityVO("진료의뢰센터","",22,370,152,1));
        facilityVOList.add(new FacilityVO("채혈실","",23,170,258,1));
        facilityVOList.add(new FacilityVO("핵의학과(PET-CT실)","",24,110,295,1));
        facilityVOList.add(new FacilityVO("혈액종양내과","",25,526,136,1));

        facilityVOList.add(new FacilityVO("호흡기알레르기내과","",26,237,136,1));
        facilityVOList.add(new FacilityVO("암센터외래부","",27,526,136,1));
        facilityVOList.add(new FacilityVO("방재센터","",28,110,252,1));
        facilityVOList.add(new FacilityVO("발전후원회","",29,442,360,1));
        facilityVOList.add(new FacilityVO("유아휴게실","",30,353,315,1));

        facilityVOList.add(new FacilityVO("홍보대외협력","",31,426,248,1));
    }
}

