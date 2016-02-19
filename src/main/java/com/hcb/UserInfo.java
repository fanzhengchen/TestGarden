package com.hcb;


import com.hcb.util.UidUtil;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by mark on 16-2-19.
 */
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    private String id;
    private String avatar;
    private String nickname;
    private String birthday;
    private String gender;
    private String phone;
    private ArrayList<String> plantType;

    public UserInfo() {
        this.id = UidUtil.createId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getPlantType() {
        return plantType;
    }

    public void setPlantType(ArrayList<String> plantType) {
        this.plantType = plantType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
