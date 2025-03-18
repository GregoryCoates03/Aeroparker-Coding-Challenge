package com.example.demo;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @Autowired
    private CustomersRepository customersRepository;

    @PostMapping("/addCustomer")
    public String addNewCustomer (
        @RequestParam String title,
        @RequestParam String first_name,
        @RequestParam String last_name,
        @RequestParam String email_address,
        @RequestParam String address_line_1,
        @RequestParam String address_line_2,
        @RequestParam String city,
        @RequestParam String postcode,
        @RequestParam String phone_number
        ) {

        Customers existingCustomer = customersRepository.findByEmailAddress(email_address.toLowerCase());

        if (existingCustomer != null) {
            return "redirect:/email";
        }

        Customers n = new Customers();
        n.setTitle(title);
        n.setRegistered(LocalDate.now());
        n.setEmail_Address(email_address.toLowerCase());
        n.setFirst_Name(first_name);
        n.setLast_Name(last_name);
        n.setAddress_Line_1(address_line_1);
        n.setAddress_Line_2(address_line_2);
        n.setCity(city);
        n.setPostcode(postcode);
        n.setPhone_Number(phone_number);
        System.out.println(customersRepository.save(n));
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(Model model) {
        return "success";
    }

    @GetMapping("/registration")
	public String registration(Model model) {
		return "registration";
	}
}
