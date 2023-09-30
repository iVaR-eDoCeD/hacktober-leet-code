func containsDuplicate(nums []int) bool {
	elementMap := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		value := nums[i]
		if elementMap[value] != 0 {
			newValue := elementMap[value] + 1
			if newValue > 1 {
				return true
			}
		} else {
			elementMap[value] = 1
		}
	}
	return false
}