# Test Charter
## Charter 1 - Explore home screen
### Areas - 
- Check pie chart shows data for different categories
- Check all icons respond to tap
- Check all expense icons show new expense screen
- Check balance amount is shown with currency symbol
- Check the current day / week / month / year is displayed on top middle of screen
- Check income is shown in green and expense amount is shown in red font
- Tapping on 'Balance' should show income and expense details by category
- Tapping on 'Expense' should open new expense to be added screen
- Tapping on 'Income' should show new income to be added screen
- Swiping left on the screen should show data for earlier time interval
- Swiping right on the screen should show data for later time interval
- Tapping on Menu icon on top left should open panel to select type of data as well as interval


## Charter 2 - Balance button and balance details
### Areas - 
- 'Balance' text should be displayed on the button followed by currency symbol and amount
- Tapping on the button should open Balance details
- Balance details should be present category-wise along with total amount for each category
- On tapping a category, further breakdown of each record in that category should be shown with amount
- Tapping on filter icon on right side should sort the data by date in descending order
- Tapping on 'Expense' should open new expense to be added screen
- Tapping on 'Income' should show new income to be added screen
- Tapping on button should hide balance details

## Charter 3 - Add expense screen 
### Areas - 
- Tapping on 'Expense' button should open add new expense screen
- Today's date should be displayed by default on the top middle part of screen
- Tapping on date should open calendar of current month
- Tapping on numbers should select those numbers
- Tapping on X should remove the numbers
- Tapping on 'Choose category' should open all categories for expense type
- Tapping on 'Choose category' should open all categories for expense type only when some amount has been taken
- Add a new category should be present at the end of the list
- Back button on top left should take user back to home screen


## Charter 4 - Add income screen 
### Areas - 
- Tapping on 'Income' button should open add new income screen
- Today's date should be displayed by default on the top middle part of screen
- Tapping on date should open calendar of current month
- Tapping on numbers should select those numbers
- Tapping on X should remove the numbers
- Tapping on 'Choose category' should open all categories for income type
- Tapping on 'Choose category' should open all categories for income type only when some amount has been taken
- Add a new category should be present at the end of the list
- Back button on top left should take user back to home screen


### Findings
- On add expense screen on tapping the date, the calendar opens but the date flickers in the background
- On add income screen on tapping the date, the calendar opens but the date flickers in the background
- Year 1900 can be entered manually which is of no use. There should be a dropdown available for calendar rather than allowing user to enter it manually
- On add expense screen on tapping 'Choose category' -> 'ADD' prompts user to purchase pro version. On navigating back the ADD button remains highlighted
- On add income screen on tapping 'Choose category' -> 'ADD' prompts user to purchase pro version. On navigating back the ADD button remains highlighted
- Adding a new income shows the newly added amount 'take off' from the expense field inside of the pie chart
- App lock should be provided for security reasons even in free version.

### Prioritisation
Priority 1: Home screen should be tested first as it is the dashboard for all that is happening with the data entered by the user
Priority 2: View data by intervals - day / week / month / year / custom interval
Priority 3: Add income and Add expense
Priority 4: Settings

### Time for each charter
Charter 1 : 30 minutes
Charter 2 : 20 minutes
Charter 3 : 15 minutes
Charter 4 : 15 minutes
### Risks to mitigiate
- Data hack should be prevented as this is a Finance app
- All categories should sum in the correct expense type
- Adding an Expense should not add up in Income category
- Adding an Income should not add up in Expense category
- Sum(or subtraction) of amounts should be correct



