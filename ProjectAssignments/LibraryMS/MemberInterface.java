package library.members;

public interface MemberInterface {
    void addMember(String name, String memberId);

    void removeMember(String memberId);

    void displayMembers();
}