package cn.jansen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhangxun
 * @email 1589666178@qq.com
 * @date 2018/11/13 20:45
 */
@SpringBootApplication
@ServletComponentScan
public class SpringbootDemosApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemosApplication.class, args);
	}
}
