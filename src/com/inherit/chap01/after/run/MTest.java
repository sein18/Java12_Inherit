package com.inherit.chap01.after.run;

import java.util.Date;

import com.inherit.chap01.after.model.dto.Computer;
import com.inherit.chap01.after.model.dto.Desktop;
import com.inherit.chap01.after.model.dto.SmartPhone;
import com.inherit.chap01.after.model.dto.Television;

public class MTest {
	public static void main(String[] args) {
		Television t = new Television("LG", "03", "T-3333", "LGTV", 400, new Date(), 65);
		Desktop d = new Desktop("����", "01", "m-01234", "���̸�", 500, new Date(), "m1", 500, 32, "��os", true);
		SmartPhone s = new SmartPhone("�Ｚ", "02", "g-3333", "������", 130, new Date(), "�����巡��", 100, 16, "android", "KT");
		System.out.println(t.information());
		System.out.println(d.information());
		System.out.println(s.information());

	}

}
