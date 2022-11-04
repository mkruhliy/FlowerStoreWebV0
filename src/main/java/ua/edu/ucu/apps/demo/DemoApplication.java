package ua.edu.ucu.apps.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flower.*;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private String data;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return data;
//	@GetMapping
//	public List<FlowerBucket> hello() {
//
//		FlowerBucket flowerBucketOne = new FlowerBucket();
//
//		Flower roseFlower = new Flower();
//		final int ROSEPRICE = 20;
//		roseFlower.setPrice(ROSEPRICE);
//		roseFlower.setFlowertype(FlowerType.ROSE);
//		final int ROSESEPALLENGTH = 2;
//		roseFlower.setSepalLength(ROSESEPALLENGTH);
//		roseFlower.setColor(FlowerColor.BLUE);
//		final int ROSEAMOUNT = 5;
//		FlowerPack rosePack = new FlowerPack(roseFlower, ROSEAMOUNT);
//
//		Flower tulipFlower = new Flower();
//		final int TULIPRICE = 15;
//		tulipFlower.setPrice(TULIPRICE);
//		tulipFlower.setFlowertype(FlowerType.TULIP);
//		final int TULIPSEPALLENGTH = 3;
//		tulipFlower.setSepalLength(TULIPSEPALLENGTH);
//		tulipFlower.setColor(FlowerColor.RED);
//		final int TULIPAMOUNT = 2;
//		FlowerPack tulipPack = new FlowerPack(tulipFlower, TULIPAMOUNT);
//
//		flowerBucketOne.add(rosePack);
//		flowerBucketOne.add(tulipPack);
//
//		return List.of(flowerBucketOne);
	}
}
