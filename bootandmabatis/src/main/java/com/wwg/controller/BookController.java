package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultDto;
import com.wwg.dto.PageDto;
import com.wwg.dto.PageRequest;
import com.wwg.dto.TeachBookDto;
import com.wwg.entity.TeachBook;
import com.wwg.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wwg on 2017/9/19.
 */
@RestController
@RequestMapping(value = "book")
@CrossOrigin
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "findAllByPage", method = RequestMethod.POST)
    public ResultDto findAllByPage(@RequestBody PageDto dto){
        PageInfo<TeachBook> pageInfo = bookService.findAll(dto.buildPage(dto.getPageNum()));
        return ResultDto.toSuccess(new PageRequest<>(pageInfo));
    }

    @RequestMapping(value = "upsert", method = RequestMethod.POST)
    public ResultDto add(@RequestBody TeachBookDto dto){
        List<TeachBook> teachBooks = TeachBookDto.formList(dto);
        if(teachBooks == null){
            return ResultDto.toError("传入参数错误");
        }
        bookService.upsertBatch(teachBooks);
        return ResultDto.toSuccess("success");
    }

}
