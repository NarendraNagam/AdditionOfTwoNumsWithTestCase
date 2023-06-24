package com.example.AddingTwoNumbers.AddController;
import com.example.AddingTwoNumbers.utility.AdditionUtility;
import com.example.AddingTwoNumbers.domain.Addition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/additionoftwo")
@Controller
public class AdditionController
{
    @PostMapping("/adding")
    @ResponseBody
    public AdditionResult addNumbers(@RequestBody Addition addition)
    {
        AdditionResult result = new AdditionResult();
        result.setNumber1(addition.getNum1());
        result.setNumber2(addition.getNum2());

        int addResult = AdditionUtility.add(addition.getNum1(), addition.getNum2());
        result.setSum(addResult);
        return result;
    }
}