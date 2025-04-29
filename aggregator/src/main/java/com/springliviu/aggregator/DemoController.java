package com.springliviu.aggregator;

import com.springliviu.shapes.Circle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/circle")
	public String circleInfo() {
		Circle circle = new Circle(3);
		return circle.name() + ", площадь = " + circle.area();
	}
}