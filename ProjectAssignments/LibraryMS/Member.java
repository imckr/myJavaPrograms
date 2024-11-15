package library.members;

import java.util.ArrayList;
import java.util.List;

public class Member implements MemberInterface {
    private List<String> members = new ArrayList<>();

    @Override
    public void addMember(String name, String memberId) {
        members.add("Name: " + name + ", Member ID: " + memberId);
    }

    @Override
    public void removeMember(String memberId) {
        members.removeIf(member -> member.contains("Member ID: " + memberId));
    }

    @Override
    public void displayMembers() {
        for (String member : members) {
            System.out.println(member);
        }
    }
}