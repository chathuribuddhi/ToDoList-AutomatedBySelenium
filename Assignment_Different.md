| | | | | | | | |
|-|-|-|-|-|-|-|-|
| |Project Name : | | | | | | |
| |Module : | | | | | | |
| |Test Scenario :    Verify ToDo List| | | | | | |
| |Date :                     2021-05-09 | | | | | | |
| |Designed By :      Chathuri Buddhika| | | | | | |
| |Reviewed By : | | | | | | |
| | | | | | | | |
|TC No.|Test Case|Test Steps|Test Data|Expected Result|Severity|Priority|Type|
|1|Verify URL is navigating to ToDo page correctly|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to correct page|High|High|Positive|
|2|Verify ToDo can be added to the list|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
|3|Verify ToDo can be deleted from the list|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Mouse hover to added ToDo| |Delete mark (X) should be populated| | | |
| | |5. Click on "X" mark to delete the entered ToDo| |ToDo should be deleted from the List| | | |
|4|Verify ToDo can be marked as completed|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
|5|Verify Completed ToDo can be undo|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Click again on the circle at the beginning of the Todo| |ToDo should be marked as Uncompleted| | | |
|6|Verify Completed ToDo can be filtered|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Completed" button| |Test text, Test text2 should be filtered.| | | |
|7|Verify Active ToDos can be filtered|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|High|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Active" button| |Test text3 should be filtered.| | | |
|8|Verify All ToDos can be filtered after filtering completed|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Medium|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Completed" button| |Test text, Test text2 should be filtered.| | | |
| | |11. Click on "All" button| |All ToDos should be displayed. | | | |
|9|Verify All ToDos can be filtered after filtering Active|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Medium|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Active" button| |Test text3 should be filtered.| | | |
| | |11. Click on "All" button| |All ToDos should be displayed. | | | |
|10|Verify Active ToDos can be filtered after filtering completed|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Medium|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Completed" button| |Test text, Test text2 should be filtered.| | | |
| | |11. Click on "Active" button| |Test text3 should be filtered.| | | |
|11|Verify Completed ToDos can be filtered after filtering Active|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Medium|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Active" button| |Test text3 should be filtered.| | | |
| | |11. Click on "Completed" button| |Test text, Test text2 should be filtered.| | | |
|12|Verify all completed ToDos can be deleted by "Clear Completed"|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Medium|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Click on "Clear Completed" button| |All Completed ToDos should be deleted| | | |
|13|Verify completed items are displaying in gray color and strikethrough text|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Low|Low|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |item should be in gray color and strikethrough text| | | |
|14|Verify alphabets are allowed  |1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|High|Medium|Positive|
| | |2. Enter alphabetic text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
|15|Verify numbers are allowed  |1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Low|Positive|
| | |2. Enter numbers  on "What needs to be done" textbox|12345|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
|16|Verify special characters are allowed  |1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Medium|Low|Positive|
| | |2. Enter special characters  on "What needs to be done" textbox|Test - text@|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
|17|Verify only spaces are not allowed  |1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Low|Low|Negative|
| | |2. Enter only spaces  on "What needs to be done" textbox| |Only spaces should be there| | | |
| | |3. Press Enter| |Empty ToDo should not be added to the List| | | |
|18|Verify completed ToDo can be deleted from the list|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Low|Low|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |4. Mouse hover to added ToDo| |Delete mark (X) should be populated| | | |
| | |5. Click on "X" mark to delete the entered ToDo| |ToDo should be deleted from the List| | | |
|19|Verify leading spaces are removed|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Low|Low|Positive|
| | |2. Enter a text with leading spaces  on "What needs to be done" textbox|             Test text|Only text should be there| | | |
| | |3. Press Enter| |Empty ToDo should not be added to the List| | | |
|20|Verify number of incompleted ToDo items are shown in bottom left|1. Go to "http://todomvc.com/examples/react/#/ "| |Browser should be navigated to the URL|Low|Low|Positive|
| | |2. Enter text  on "What needs to be done" textbox|Test text|Text should be visible| | | |
| | |3. Press Enter| |ToDo should be added to the List| | | |
| | |4. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |5. Enter text  on "What needs to be done" textbox|Test text2|Text should be visible| | | |
| | |6. Press Enter| |ToDo should be added to the List| | | |
| | |7. Click on the circle at the beginning of the Todo| |ToDo should be marked as completed| | | |
| | |8. Enter text  on "What needs to be done" textbox|Test text3|Text should be visible| | | |
| | |9. Press Enter| |ToDo should be added to the List| | | |
| | |10. Check the lable located in bottom left| |The value of bottom left lable should be "1 item left"| | | |
