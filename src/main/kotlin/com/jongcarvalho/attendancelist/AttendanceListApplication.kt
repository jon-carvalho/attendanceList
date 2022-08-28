package com.jongcarvalho.attendancelist

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.FileOutputStream

@SpringBootApplication
class AttendanceListApplication

fun main(args: Array<String>) {
	runApplication<AttendanceListApplication>(*args)

	val workBook = XSSFWorkbook()
	val sheet = workBook.createSheet()

	sheet.createRow(0).createCell(0).setCellValue("Hello World")

	val output = FileOutputStream("./src/main/kotlin/com/jongcarvalho/attendancelist/sheet/test.xlsx")
	workBook.write(output)
	workBook.close()


}
